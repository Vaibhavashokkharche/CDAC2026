package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.MyUser;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyLoginServlet extends HttpServlet {
	ProductService pservice =new ProductServiceImpl();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	
	    String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		System.out.println(username);
		System.out.println(password);
		MyUser user=pservice.authenticateUser(username,password);
	if(user!=null) {
		if(user.getRole().equals("admin")) {
		out.println("you are "+user.getRole());
		RequestDispatcher rd=request.getRequestDispatcher("displayall");
		rd.forward(request, response);
		}
		else if(user.getRole().equals("user")) {
			out.println("You are "+user.getRole());
		}
	}else {
		out.println("Invalid Credintials");
	}
	
		
		
	}
	
	
	
	

}
