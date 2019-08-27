package nuc.wssp.handlers;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Experience;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Worktable;
import nuc.wssp.service.IGroupheaderService;
import nuc.wssp.service.IStudentService;

@Controller
@RequestMapping("/groupheader")
public class GroupheaderController{
	
	@Autowired
    private IGroupheaderService service;
	@Autowired
    private IStudentService services;

	/*组长登录*/ 
	@RequestMapping("/groupHeader.do")
	public ModelAndView doGroupHeaderLogin(Long gid,String spassword,HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();	
		if(service.queryGroupheaderGid(gid) == null) {
			mView.setViewName("studentpage/student");
		}else{
			Student stu = services.verifyStudent(gid);
			if(stu.getSpassword().equals(spassword)) {
				session.setAttribute("gid", gid);
				mView.addObject("srcpage", "groupheader/myTeamMemberPage.do");
				mView.setViewName("groupheaderpage/groupHeader");
			}else {
				mView.setViewName("studentpage/student");
			}
			
		}
		    return mView;	
	}
	
	
	/*组长组员获取*/
	@RequestMapping("/myTeamMember.do")
	public ModelAndView doMyTeamMember() {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		mView.addObject("srcpage", "groupheader/myTeamMemberPage.do");
		mView.setViewName("groupheaderpage/groupHeader");
		return mView;	
	}
	@RequestMapping("/myTeamMemberPage.do")
	public ModelAndView doMyTeamMemberPage(HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Groupheader gheader = service.queryGroupheaderGid(gid);
		if(service.queryWorktableListAnumber(gheader.getAnumber()).size() == 0) {
			mView.setViewName("groupheaderpage/error");
		}else {
			List<Worktable> lWorktables = service.queryWorktableListAnumber(gheader.getAnumber());
			for(Worktable wtable : lWorktables) {
			    Student stu = services.verifyStudent(wtable.getSid());
				wtable.setStudent(stu);
			}
			mView.addObject("lWorktables", lWorktables);
			mView.setViewName("groupheaderpage/myTeamMember");
		}	
		return mView;	
	}
	
	
	/*组员日常表现填写页面*/
	@RequestMapping("/fillInDaily.do")
	public ModelAndView doFillInDaily() {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		mView.addObject("srcpage", "groupheader/fillInDailyPage.do");
		mView.setViewName("groupheaderpage/groupHeader");
		return mView;	
	}
	@RequestMapping("/fillInDailyPage.do")
	public ModelAndView doFillInDailyPage(HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		
		long gid = (long) session.getAttribute("gid");
		Groupheader gheader = service.queryGroupheaderGid(gid);
		if(service.queryWorktableListAnumber(gheader.getAnumber()).size() == 0) {
			mView.setViewName("groupheaderpage/error");
		}else {
			List<Worktable> lWorktables = service.queryWorktableListAnumber(gheader.getAnumber());
			for(Worktable wtable : lWorktables) {
			    Student stu = services.verifyStudent(wtable.getSid());
			    List<Behavior> behaviors = service.queryBehaviorSid(wtable.getSid());
				wtable.setStudent(stu);
				wtable.setLbehaviors(behaviors);
			}
			mView.addObject("lWorktables", lWorktables);
			mView.setViewName("groupheaderpage/fillInDaily");
		}

		return mView;	
	}
	
	
	/*组员日常表现填写操作*/
	@RequestMapping("/insertBehavior.do")
	public ModelAndView doInsertBehavior(Behavior behavior,HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Behavior bhav = new Behavior();
		bhav.setSid(behavior.getSid());
		bhav.setContent(behavior.getContent());
		bhav.setCount(behavior.getCount()+1);
		bhav.setGid(gid);
		Date date = new Date();
		bhav.setTime(date.toLocaleString());
		service.insertBehavior(bhav);
		mView.setViewName("redirect:fillInDailyPage.do");
		return mView;	
	}
	
	/*组员日常表现评级操作*/
	@RequestMapping("/insertBehaviorGrade.do")
	public ModelAndView doInsertBehaviorGrade(Behavior behavior) {
		ModelAndView mView = new ModelAndView();
		Behavior bhav = new Behavior();
		bhav.setSid(behavior.getSid());
		bhav.setCount(behavior.getCount());
		bhav.setGrade(behavior.getGrade());
		service.insertBehaviorGrade(bhav);
		mView.setViewName("redirect:fillInDailyPage.do");
		return mView;
	}
	
	
	
	/*组员工资发放填写页面*/
	@RequestMapping("/fillInSalary.do")
	public ModelAndView doFillInSalary() {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		mView.addObject("srcpage", "groupheader/fillInSalaryPage.do");
		mView.setViewName("groupheaderpage/groupHeader");
		return mView;	
	}
	@RequestMapping("/fillInSalaryPage.do")
	public ModelAndView doFillInSalaryPage(HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Groupheader gheader = service.queryGroupheaderGid(gid);
		if(service.queryWorktableListAnumber(gheader.getAnumber()).size() == 0) {
			mView.setViewName("groupheaderpage/error");
		}else {	
			List<Worktable> lWorktables = service.queryWorktableListAnumber(gheader.getAnumber());
			Iterator<Worktable> iterator = lWorktables.iterator();
			while(iterator.hasNext()) {
				Worktable tworktable = iterator.next();
				if(service.querySalarySid(tworktable.getSid()) != null) {
					iterator.remove();
				}
				
				
			}
			
//			for(int i=0;i<lWorktables.size();i++) {
//				if(service.querySalarySid(lWorktables.get(i).getSid()) != null ) {
//					lWorktables.remove(i);
//					i=i-1;
//				}
//			}
			for(Worktable wtable : lWorktables) {
			    Student stu = services.verifyStudent(wtable.getSid());
			    List<Behavior> behaviors = service.queryBehaviorSid(wtable.getSid());	
				if((behaviors.size() >= 4) && (behaviors.get(3).getGrade() != null)) {
					stu.setGrade(1);
					wtable.setStudent(stu);
				}else {
					stu.setGrade(0);
					wtable.setStudent(stu);
				}
				wtable.setLbehaviors(behaviors);
			}
			List<Salary> lSalaries = service.querySalaryGid(gid); 
			if(service.querySalaryGid(gid).size() > 0) {
				for(Salary salary : lSalaries) {
					Student stud = services.verifyStudent(salary.getSid());
					salary.setSname(stud.getSname());
					Behavior behav = service.queryBehaviorSidCount(salary.getSid(), 4);
					salary.setGrade(behav.getGrade());
				}
			}
			mView.addObject("lSalaries", lSalaries);
			mView.addObject("lWorktables", lWorktables);
			mView.setViewName("groupheaderpage/fillInSalary");
		}
		return mView;	
	}
	
	
	/*组员工资填写操作*/
	@RequestMapping("/insertSalary.do")
	public ModelAndView doInsertSalary(Salary salary,HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Salary sal = new Salary();
		sal.setSid(salary.getSid());
		sal.setReward(salary.getReward());
		sal.setGid(gid);
		Date date = new Date();
		sal.setTime(date.toLocaleString());
		service.insertSalary(sal);
		mView.setViewName("redirect:fillInSalaryPage.do");
		return mView;	
	}
	
	/*组员工资修改操作*/
	@RequestMapping("/updateSalarySid.do")
	public ModelAndView doUpdateSalarySid(Salary salary) {
		ModelAndView mView = new ModelAndView();
		Salary sal = new Salary();
		sal.setSid(salary.getSid());
		sal.setReward(salary.getReward());
		service.updateSalarySid(sal);
		mView.setViewName("redirect:fillInSalaryPage.do");
		return mView;
	}
	
	
	/*组长心得及月末总结填写*/
	@RequestMapping("/fillInYourExperience.do")
	public ModelAndView doFillInYourExperience() {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();	
		mView.addObject("srcpage", "groupheader/fillInYourExperiencePage.do");
		mView.setViewName("groupheaderpage/groupHeader");
		return mView;	
	}
	@RequestMapping("/fillInYourExperiencePage.do")
	public ModelAndView doFillInYourExperiencePage(HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();	
		long gid = (long) session.getAttribute("gid");
		Experience experience = service.queryExperienceSid(gid);
		mView.addObject("gid", gid);
		mView.addObject("experience", experience);
		mView.setViewName("groupheaderpage/fillInYourExperience");
		return mView;	
	}
	
	/*组长心得填写操作*/
	@RequestMapping("/insertExperience.do")
	public ModelAndView doInsertExperience(Experience experience,HttpSession session) {
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Experience exper = new Experience();
		exper.setSid(gid);
		exper.setExperience(experience.getExperience());
		Date date = new Date();
		exper.setTime(date.toLocaleString());
		service.insertExperience(exper);;
		mView.setViewName("redirect:fillInYourExperiencePage.do");
		return mView;	
	}
	
	/*心得修改操作*/
	@RequestMapping("/updateExperienceSid.do")
	public ModelAndView doUpdateExperienceSid(Experience experience,HttpSession session) {
		ModelAndView mView = new ModelAndView();
		long gid = (long) session.getAttribute("gid");
		Experience exper = new Experience();		
		exper.setSid(gid);
		exper.setExperience(experience.getExperience());
		Date date = new Date();
		exper.setTime(date.toLocaleString());
		service.updateExperienceSid(exper);
		mView.setViewName("redirect:fillInYourExperiencePage.do");
		return mView;
	}
	
	
}
