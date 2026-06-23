package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService lservice;
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/validate")
   public ModelAndView validateUser(@RequestParam("uname") String u1,@RequestParam("pass") String pass,HttpSession session) {
		MyUser user1=lservice.validateUser(u1,pass);
		session.setAttribute("user", user1);
		if(user1!=null) {
			return new ModelAndView("redirect:/product/viewProducts");
		}else {
			//display Login.jsp
			return new ModelAndView("Login","message","Wrong credentials pls reenter");
		}
	   
   }
}
