package nuc.wssp.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import nuc.wssp.service.WebServer;

@Controller
public class WebTest {
	
	@Autowired
	private WebServer webServer;
	
	//@Autowired
//	private GroupServer groupServer;
	
	@RequestMapping("/adminFillInDlimit.do")
	public String test() {
		System.out.println("Hello World");
		webServer.displayStudent();
		return "adminpage/success";
//		groupServer.selectByStudent();
	}
	
	@RequestMapping(value = "/login.do",method = RequestMethod.GET)
	public String login(){
		return "adminpage/admin";
	}

}
