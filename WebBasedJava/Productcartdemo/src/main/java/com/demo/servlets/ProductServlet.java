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
import java.util.List;

import com.demo.model.Product;
import com.demo.model.User;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
@WebServlet("/display")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		String btn=request.getParameter("btn");
		int catid=Integer.parseInt(request.getParameter("catid"));
		System.out.println(btn);
		System.out.println(catid);
		HttpSession session= request.getSession();

		User u=(User)session.getAttribute("user");
     
      if(u!=null &&  btn.equals("add")) {
     ProductService pservice=new ProductServiceImpl();  
	  List<Product> plist= pservice.getProductById(catid);
	  plist.forEach(System.out::println);
	  session.setAttribute("plist", plist);
    
		
			
			RequestDispatcher rd= request.getRequestDispatcher("addcart.jsp");
			rd.forward(request, response);	
	}
		else {
			out.println("Invalid Creditials please try again ");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);	
			
		}
		
		
	}

}
