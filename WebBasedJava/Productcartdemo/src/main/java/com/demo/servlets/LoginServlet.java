package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.User;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

      
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pswd");
		LoginService lservice=new LoginServiceImpl();
		User u=lservice.validateUser(uname,pass);
	
		
		if(u!=null && u.getRole().equals("user")) {
			HttpSession session=request.getSession();
			session.setAttribute("user",u);
			RequestDispatcher rd= request.getRequestDispatcher("category");
			rd.forward(request, response);
			
			
		}else {
			out.println("Invalid Creditials please try again ");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
			
		}
		
		
		
		
	}
	
	
	
}
