package nuc.wssp.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import nuc.wssp.beans.Behavior;
import nuc.wssp.beans.Dlimit;
import nuc.wssp.beans.Groupheader;
import nuc.wssp.beans.Mark;
import nuc.wssp.beans.Relation;
import nuc.wssp.beans.Salary;
import nuc.wssp.beans.Student;
import nuc.wssp.beans.Voqo;
import nuc.wssp.beans.Worktable;
import nuc.wssp.dao.IGroupheaderDao;
import nuc.wssp.data.RelationDate;
import nuc.wssp.service.AdminServer;
import nuc.wssp.service.IGroupheaderService;
import nuc.wssp.service.IStudentService;



@RequestMapping("/admin")
@Controller
public class Admin {

	//����Service----���ڵõ��±߱����Ϣ
	
	@Autowired
	private AdminServer adminServer;
	
	@Autowired
	private IStudentService studentServer;
	
	@Autowired
	private IGroupheaderService groupheaderServer;

	
	@RequestMapping("/login.do")
	public ModelAndView doTargetlogin(){
		// TODO Auto-generated method stub
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/admin1.do")
	public ModelAndView doTargetadmin(){
		// TODO Auto-generated method stub
		Admin admin = new Admin();
		//System.out.println(admin);
		return new ModelAndView("adminpage/admin");
	}
	
	@RequestMapping("/adminWorkManage.do")
	public ModelAndView doTargetadminWorkManage(){
		// TODO Auto-generated method stub
		//添加标记信息
		RelationDate.list1 = new ArrayList<Mark>();
		RelationDate.list2 = new ArrayList<Mark>();
		RelationDate.list3 = new ArrayList<Mark>();
		RelationDate.list4 = new ArrayList<Mark>();
		RelationDate.list5 = new ArrayList<Mark>();
		RelationDate.list6 = new ArrayList<Mark>();
		RelationDate.list7 = new ArrayList<Mark>();
		RelationDate.list8 = new ArrayList<Mark>();
		RelationDate.MARK_INFO = new HashMap<Integer,String>();
		List<Mark> list = adminServer.getMarkList();
		for (Mark mark : list) {
			RelationDate.MARK_INFO.put(mark.getNumber().intValue(), mark.getPosition());
			if(mark.getMark() == 2) {
				//宿舍
				RelationDate.list1.add(mark);
			}
			else if(mark.getMark() == 3) {
				//大岗
				RelationDate.list6.add(mark);
			}
			else if(mark.getMark() == 6){
				//卫生队
				RelationDate.list2.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 4) {
				//教学楼
				RelationDate.list3.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 5) {
				//保洁队
				RelationDate.list4.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 7) {
				//龙山岗
				RelationDate.list5.add(mark);
				RelationDate.list7.add(mark);
			}
			else if(mark.getMark() == 1) {
				//学院
				RelationDate.list8.add(mark);
			}
		}
		
		
		//System.out.println("@@@@@@@");
		return new ModelAndView("adminpage/adminWorkManage");
	}
	
	/*全部报岗成员*/
	@RequestMapping("/adminWorkForm.do")
	public ModelAndView doTargetadminWorkForm(){
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		List<Worktable> wList = new ArrayList<Worktable>();
		List<Mark> mList = new ArrayList<Mark>();
		if(adminServer.getListWorkTable().size() > 0) {
			mList = studentServer.queryMark(1);
			wList = adminServer.getListWorkTable();
			for(Worktable worktable : wList) {
				Student student = adminServer.verifyStudent(worktable.getSid());
				Mark markP = adminServer.queryMarkNumber(worktable.getBnumber());
				Mark markA = adminServer.queryMarkNumber(Long.parseLong(worktable.getAnumber()));
				worktable.setStudent(student);
				worktable.setPosition(markP.getPosition());
				worktable.setArea(markA.getPosition());
			}
			mView.addObject("wList", wList);
			mView.addObject("mList", mList);
			mView.setViewName("adminpage/adminWorkForm");
		}else {
			mView.setViewName("adminpage/error");
		}		
		return mView;
	}
	
	
	/*学院报岗成员*/
	@RequestMapping("/adminWorkFormDepartment.do")
	public ModelAndView doAdminWorkFormDepartment(String department){
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		if("全部成员".equals(department)) {
			mView.setViewName("redirect:adminWorkForm.do");
		}else {
			List<Worktable> wList = new ArrayList<Worktable>();
			List<Mark> mList = new ArrayList<Mark>();
			if(adminServer.getListWorkTable().size() > 0) {
				mList = studentServer.queryMark(1);
				wList = adminServer.getListWorkTable();			
				Iterator<Worktable> iterator = wList.iterator();
				while(iterator.hasNext()) {
					Worktable tWorktable = iterator.next();
					Student student = adminServer.verifyStudent(tWorktable.getSid());
					if(!student.getSdepartment().equals(department)) {
						iterator.remove();
						continue;
					}
					Mark markP = adminServer.queryMarkNumber(tWorktable.getBnumber());
					Mark markA = adminServer.queryMarkNumber(Long.parseLong(tWorktable.getAnumber()));
					tWorktable.setStudent(student);
					tWorktable.setPosition(markP.getPosition());
					tWorktable.setArea(markA.getPosition());	
				}
				
				mView.addObject("wList", wList);
				mView.addObject("mList", mList);
				mView.setViewName("adminpage/adminWorkForm");
			}else {
				mView.setViewName("adminpage/error");
			}	
		}
		return mView;
	}
	
	
	
	/*全部成员工资*/
	@RequestMapping("/adminSalaryForm.do")
	public ModelAndView doTargetadminSalaryForm(){
		ModelAndView mView = new ModelAndView();
		List<Salary> lSalary = new ArrayList<Salary>();
		List<Mark> mList = new ArrayList<Mark>();
		mList = studentServer.queryMark(1);
		lSalary = adminServer.getSalary();
		for(Salary salary : lSalary) {
			Student student = studentServer.verifyStudent(salary.getSid());
			salary.setStudent(student);
			Groupheader groupheader = groupheaderServer.queryGroupheaderGid(salary.getGid());
			salary.setArea(groupheader.getArea());
		}
			
		mView.addObject("lSalary", lSalary);
		mView.addObject("mList", mList);
		mView.setViewName("adminpage/adminSalaryForm");
		return mView;
	}
	
	/*指定学院成员工资*/
	@RequestMapping("/adminSalaryFormDepartment.do")
	public ModelAndView doAdminSalaryFormDepartment(String department){
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		if("全部成员".equals(department)) {
			mView.setViewName("redirect:adminSalaryForm.do");
		}else {
			List<Salary> lSalary = new ArrayList<Salary>();
			List<Mark> mList = new ArrayList<Mark>();
			if(adminServer.getSalary().size() > 0) {
				mList = studentServer.queryMark(1);
				System.out.println(mList);
				lSalary = adminServer.getSalary();			
				Iterator<Salary> iterator = lSalary.iterator();
				while(iterator.hasNext()) {
					Salary salary = iterator.next();
					Student student = adminServer.verifyStudent(salary.getSid());
					if(!student.getSdepartment().equals(department)) {
						iterator.remove();
						continue;
					}
					Groupheader groupheader = groupheaderServer.queryGroupheaderGid(salary.getGid());
					salary.setStudent(student);
					salary.setArea(groupheader.getArea());;
				}
				
				mView.addObject("lSalary", lSalary);
				mView.addObject("mList", mList);
				mView.setViewName("adminpage/adminSalaryForm");
			}else {
				mView.setViewName("adminpage/error");
			}	
		}
		return mView;
	}
	
	
	
//	全部成员日常
	@RequestMapping("/adminBehaviorForm.do")
	public ModelAndView doTargetadminBehaviorForm(){
		// TODO Auto-generated method stub
		ModelAndView mView = new ModelAndView();
		List<Worktable> lWorktables = new ArrayList<Worktable>();
		lWorktables = adminServer.getListWorkTable();
		Iterator<Worktable> iterator = lWorktables.iterator();
		while(iterator.hasNext()) {
			Worktable worktable = iterator.next();
			List<Behavior> lBehaviors = groupheaderServer.queryBehaviorSid(worktable.getSid());
			if(lBehaviors.size() == 0) {
				iterator.remove();
				continue;
			}
			Student student = studentServer.verifyStudent(worktable.getSid());
			Mark mark = studentServer.queryMarkNumber(Long.parseLong(worktable.getAnumber()));
			worktable.setLbehaviors(lBehaviors);
			worktable.setStudent(student);
			worktable.setArea(mark.getPosition());
		}
		mView.addObject("lWorktables", lWorktables);
		mView.setViewName("adminpage/adminBehaviorForm");
		return mView;
	}
	
	/*==========添加标记开始===================*/
	
	@RequestMapping("/addMark.do")
	public String addMark(Model model,Mark mark) {
		
		adminServer.addMark(mark);
		return "redirect:adminFillInMark.do";
	}
	
	@RequestMapping("/adminFillInMark.do")
	public String doTargetadminFillInMark(Model model){
		// TODO Auto-generated method stub
		
		List<Mark> list = adminServer.getMarkList();
		

		model.addAttribute("markList", list);
		
		return "adminpage/adminFillInMark";
	}
	
	/*=============添加标记结束=====================*/
	
	/*=============添加关系开始=====================*/
	
	@RequestMapping("addRelation.do")
	public String addRelation(Model mode,String[] test,Relation relation) {
		
		int len = test.length;
		for (String string : test) {
			//System.out.println(string);
		}
		
		relation.setList(test);
		
		//字符串数组转字符串
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < len; i++){
		 sb. append(test[i]);
		 if(i!=len-1) sb.append(",");
		}
		relation.setRelation(sb.toString());
		//添加宿舍以及岗位类型编号，以及区域划分
		//System.out.println(relation);
		adminServer.addRelation(relation);
		
		return "redirect:adminFillInRelation.do";
	}
	//====================添加关系结束=================
	
	//====================修改关系====================
	@RequestMapping("/updaterelation.do")
	public String updateRelation(Model mode,Voqo voqo) {
		//System.out.println(voqo);
		Relation relation = new Relation();
		int num = -1,num1 = -1;
		for (Map.Entry<Integer, String> entry : RelationDate.MARK_INFO.entrySet()) { 
		  System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		  if(voqo.getBnumber().trim().equals(entry.getValue()) && num==-1) {
				num = entry.getKey();
			}
			if(voqo.getDnumber().trim().equals(entry.getValue()) && num1==-1) {
				num1 = entry.getKey();
			}
		}
		if(num == -1 || num1 == -1) {
			System.out.println("输入错误");
			
		}
		else {
			relation.setBnumber((long)num);
			relation.setDnumber((long)num1);
			relation.setId(voqo.getId());
			relation.setRelation(voqo.getRelation());
			
			adminServer.updateRelation(relation);
		}
		
		
		return "redirect:adminFillInRelation.do";
	}
	
	//==================修改关系结束===============
	
	//=================关系总跳转=================
	@RequestMapping("/adminFillInRelation.do")
	public String doTargetadminFillInRelation(Model model){
		// TODO Auto-generated method stub
		

		//获取联系信息  同时获得标记信息
		List<Relation> list = adminServer.getRelationList();
		for (Relation relation : list) {
			String[] s = relation.getRelation().split(",");
			int len = s.length;
			for(int i = 0; i < len; i++) {
				s[i] = RelationDate.MARK_INFO.get(Integer.parseInt(s[i]))+"   "+Integer.parseInt(s[i]);
			}
			relation.setList(s);
			relation.setName(RelationDate.MARK_INFO.get(relation.getDnumber().intValue()));
			relation.setName1(RelationDate.MARK_INFO.get(relation.getBnumber().intValue()));
		}
		
		for (Relation relation : list) {
			//System.out.println(relation);
		}
		
		
		
		model.addAttribute("list1", RelationDate.list1);
		model.addAttribute("list2", RelationDate.list2);
		model.addAttribute("list3", RelationDate.list3);
		model.addAttribute("list4", RelationDate.list4);
		model.addAttribute("list5", RelationDate.list5);
		model.addAttribute("list6", RelationDate.list6);
		model.addAttribute("relationlist", list);
		model.addAttribute("mark", RelationDate.MARK_INFO);
		
		return "adminpage/adminFillInRelation";
	}
	//====================关系总跳转结束====================
	
	//=====================添加组长=======================
	@RequestMapping("/addHeader.do")
	public String addHeader(Model model,Groupheader groupheader) {
		System.out.println(groupheader);
		groupheader.setArea(RelationDate.MARK_INFO.get(groupheader.getAnumber().intValue()));
		groupheader.setCount(30L);
		adminServer.addGroupHeader(groupheader);
		
		return "redirect:adminFillInGroupheader.do";
	}
	
	//====================添加时间结束=================
	
	//====================删除组长事件================
	
	@RequestMapping("/deleteHeader.do")
	public String deleteHeader(Groupheader groupheader) {
		//删除操作
		//传值进来
		System.out.println(groupheader);
		adminServer.deleteGrounpHeader(groupheader);
		
		return "redirect:adminFillInGroupheader.do"; 
	}
	 
	
	//=====================删除组长事件结束==============
	
	@RequestMapping("/adminFillInGroupheader.do")
	public String doTargetadminFillInGroupheader(Model model){
		// TODO Auto-generated method stub
		List<Groupheader> list = adminServer.getGroupHeader();
		for (Groupheader groupheader : list) {
			//System.out.println(groupheader);
		}
		model.addAttribute("liststudent",adminServer.getStudent());
		model.addAttribute("list7", RelationDate.list7);
		model.addAttribute("grouplist", list);
		//return "adminpage/adminSalaryForm";
		return "adminpage/adminFillInGroupheader";
	}
	
	//=====================组长事件结束***************
	
	//=====================添加每个院限制的人数=========
	@RequestMapping("/addDlimit.do")
	public String addDlimit(Model model,Dlimit dlimit) {
		
		String bh = "";
		for(Mark mark: RelationDate.list6) {
			bh += mark.getNumber();
			bh+=",";
		}
		bh = bh.substring(0, bh.length()-2);
		dlimit.setArrbnumber(bh);
		System.out.println(dlimit);
		adminServer.addDlimit(dlimit);
		
		return "redirect:adminFillInDlimit.do";
	}
	
	
	
	@RequestMapping("/updateDlimit.do")
	public String updateDlimit(Model model,Dlimit dlimit) {
		System.out.println(dlimit);
		adminServer.updateDlimit(dlimit);
		return "redirect:adminFillInDlimit.do";
	}
	
	@RequestMapping("/adminFillInDlimit.do")
	public String doTargetadminFillInDlimit(Model model){
		// TODO Auto-generated method stub
		
		//获取所有院系标签
		//已经保存到了RealationDate中
		
		//获得所有院的限制情况
		List<Dlimit> list = adminServer.getDlimit();
		for (Dlimit dlimit : list) {
			System.out.println(dlimit);
		}
		model.addAttribute("dlimit", list);
		model.addAttribute("list8", RelationDate.list8);
		model.addAttribute("list6", RelationDate.list6);
		return "adminpage/adminFillInDlimit";
	}
	
	
	//=====================添加结束=============
	

	
}
