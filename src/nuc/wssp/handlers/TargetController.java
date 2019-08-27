package nuc.wssp.handlers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/target")
public class TargetController{

	@RequestMapping("/login.do")
	public ModelAndView doTargetlogin(){
		// TODO Auto-generated method stub
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/admin.do")
	public ModelAndView doTargetadmin(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/admin");
	}
	
	@RequestMapping("/adminWorkManage.do")
	public ModelAndView doTargetadminWorkManage(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminWorkManage");
	}
	
	@RequestMapping("/adminWorkForm.do")
	public ModelAndView doTargetadminWorkForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminWorkForm");
	}
	
	@RequestMapping("/adminSalaryForm.do")
	public ModelAndView doTargetadminSalaryForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminSalaryForm");
	}
	
	@RequestMapping("/adminBehaviorForm.do")
	public ModelAndView doTargetadminBehaviorForm(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminBehaviorForm");
	}
	
	
	
	@RequestMapping("/adminFillInMark.do")
	public ModelAndView doTargetadminFillInMark(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminFillInMark");
	}
	
	@RequestMapping("/adminFillInRelation.do")
	public ModelAndView doTargetadminFillInRelation(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminFillInRelation");
	}
	
	@RequestMapping("/adminFillInGroupheader.do")
	public ModelAndView doTargetadminFillInGroupheader(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminFillInGroupheader");
	}
	
	@RequestMapping("/adminFillInDlimit.do")
	public ModelAndView doTargetadminFillInDlimit(){
		// TODO Auto-generated method stub
		return new ModelAndView("adminpage/adminFillInDlimit");
	}
	
	
	@RequestMapping("/student.do")
	public ModelAndView doTargetstudent(){
		// TODO Auto-generated method stub
		return new ModelAndView("studentpage/student");
	}
	

}
