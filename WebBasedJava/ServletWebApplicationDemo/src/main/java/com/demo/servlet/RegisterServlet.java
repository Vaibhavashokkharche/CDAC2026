package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         resp.setContentType("text/html");
         PrintWriter out= resp.getWriter();
         if(req.getParameter("uname")!=null&&
            req.getParameter("email")!=null&& 
            req.getParameter("password")!=null) {
        	 
        	 String uname=req.getParameter("uname").trim();
        	 String email=req.getParameter("email").trim();
        	 String password=req.getParameter("password");
        	 if(!uname.isEmpty()&&!email.isEmpty()&&!password.isEmpty()) {
        		 out.println("User register succesfully");
        	 }
        	 else {
        		 out.println("Registration failed please try again.");
        		 RequestDispatcher r= req.getRequestDispatcher("register.html");
        	 }
         }
         
		
	}

	

}
