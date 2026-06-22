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

import com.demo.model.Category;
import com.demo.model.User;
import com.demo.service.CategoryService;
import com.demo.service.CategoryServiceImp;
import com.mysql.cj.Session;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		PrintWriter out = response.getWriter();
	User u=(User)session.getAttribute("user");
  if(u!=null) {
		CategoryService cservice = new CategoryServiceImp();
		List<Category> clist = cservice.getAllCategories();

		request.setAttribute("clist", clist);
		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
  }
  else {
	  
	    out.println("Invalid Creditials please try again ");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.include(request, response);  
	  
	  
  }
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
