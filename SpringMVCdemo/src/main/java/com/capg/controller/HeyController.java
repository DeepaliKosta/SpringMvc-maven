package com.capg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HeyController {

//	@RequestMapping("/hey")
//	public String display(HttpServletRequest request,Model m) {
//		String name=request.getParameter("name");
//		String password = request.getParameter("pass");
//		
//		if(password.equals("admin")) {
//			String msg = "Hello " + name;
//			m.addAttribute("message",msg);
//			return "viewpage";
//		}
//		else
//		{
//			String msg="Sorry " + name + ". You entered an incorrect password";
//			m.addAttribute("message", msg);
//			return "errorpage";
//		
//		}
//	}
	
//	@RequestMapping("/hey")
//	public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m) {
//		Student st = new Student();
//		st.setName(name);
//		st.setPass(pass);
//		
//		m.addAttribute("message", st);
//		
//		return "viewpage";
//	}
	
	
	
}
