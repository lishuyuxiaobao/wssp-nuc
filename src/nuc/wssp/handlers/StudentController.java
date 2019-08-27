package nuc.wssp.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hp.hpl.sparta.ParseLog;
import com.jcraft.jsch.Session;

import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;
import nuc.wssp.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController{
	
	@Autowired
    private IStudentService service;

	/*学生登录*/ 
	@RequestMapping("/student.do")
	public ModelAndView doStudentLogin(Student student,HttpSession session) {
		// TODO Auto-generated method stub
		Student stu = service.verifyStudent(student.getSid());
		
		ModelAndView mView = new ModelAndView();
		if(stu.getSpassword().equals(student.getSpassword())) {
			session.setAttribute("sid", student.getSid());
			mView.setViewName("studentpage/student");		
		}else {
			mView.setViewName("login/login");		
		}
		    return mView;	
	}
	
	/*进入报岗需要获取的信息*/ 
	@RequestMapping("/stuMountGuard.do")
	public ModelAndView doQueryMark(HttpSession session) {
		// TODO Auto-generated method stub
		List<Mark> marks = new ArrayList<Mark>();
		marks = (List<Mark>) service.queryMark(3);
		long sid = (long) session.getAttribute("sid");
		Worktable wtable = service.queryWorktableSid(sid);
		
		/*获取每个类型岗位的限制人数*/
		Student student = service.verifyStudent(sid);
		Mark mark = service.queryMarkSdepartment(student.getSdepartment());
		Dlimit dlimit = service.queryDlimitYnumber(mark.getNumber());
		String[] StrArray=dlimit.getArrbnumber().split(",");
		String[] StrArray1=dlimit.getArrcount().split(",");
		
		int csize = marks.size();
		int sarry = StrArray.length;
		for(int i=0;i<sarry;i++){
			
			for(int j=0;j<csize;j++) {
				if(marks.get(j).getNumber() == Long.parseLong(StrArray[i]) ) {
					marks.get(j).setCount(Long.parseLong(StrArray1[i]));
				}
			}
		}
		
		/*获取报名每一个类型岗位的人数*/
		List<Worktable> lWorktables = new ArrayList<Worktable>();
		for(int i=0;i<csize;i++) {
			lWorktables = service.queryWorktableBnumber(marks.get(i).getNumber());
			marks.get(i).setLwList(lWorktables);
		}
		
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("marks",marks);
		mView.addObject("wtable", wtable);
		mView.addObject("student", student);
		
		mView.setViewName("studentpage/stuMountGuard");
		return mView;	
	}
	
	/*学生个人信息需要获得的信息*/ 
	@RequestMapping("/stuPersonalInfo.do")
	public ModelAndView doStudentInfo(HttpSession session) {
		// TODO Auto-generated method stub
		long sid = (long) session.getAttribute("sid");
		Student student = service.verifyStudent(sid);
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("student",student);

		if(service.queryWorktableSid(sid) == null || service.queryWorktableSid(sid).getAnumber().contains(",")) {
			mView.addObject("wt",1);
		}else {
			Worktable wtable = service.queryWorktableSid(sid);
			Mark bmark = service.queryMarkNumber(wtable.getBnumber());
			Mark amark = service.queryMarkNumber(Long.parseLong(wtable.getAnumber()));
			Groupheader groupheader = service.queryGroupheaderAnumber(Long.parseLong(wtable.getAnumber()));
			Student studentn = service.verifyStudent(groupheader.getGid());
			
			mView.addObject("studentn",studentn);
			mView.addObject("bmark",bmark);
			mView.addObject("amark",amark);
			mView.addObject("wtable",wtable);
		}
					
		mView.setViewName("studentpage/stuPersonalInfo");
		return mView;	
	}
	
	/*修改个人信息操作*/ 
	@RequestMapping("/updateStudentInfo.do")
	public ModelAndView doUpdateStudentInfo(Student student,HttpSession session) {
		// TODO Auto-generated method stub
		service.updateStudentInfo(student);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("redirect:stuPersonalInfo.do");
		return mView;	
	}
	
	/*学生报名上岗的操作*/ 
	@RequestMapping("/insertWorktable.do")
	public ModelAndView doInsertWorktable(long dnumber,long bnumber,HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long sid = (long) session.getAttribute("sid");
		Relation relation = service.queryRelationDBnumber(dnumber, bnumber);
		Worktable wtable = new Worktable();
		wtable.setSid(sid);
		wtable.setBnumber(bnumber);
		wtable.setAnumber(relation.getRelation());
		service.insertWorktable(wtable);
		
		mView.setViewName("redirect:stuMountGuard.do");
		return mView;	
	}
	
}
