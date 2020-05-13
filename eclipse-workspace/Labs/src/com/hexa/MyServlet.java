package com.hexa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("We are in Init method");
	}
       
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user");
		String pwd = request.getParameter("pass");
		out.println("<html>");
		out.println("<h1>");
		out.println("Welcome to Servlet Programing");
		out.println("</h1>");
		out.println("<html>");
		out.println("We are out siders");
		out.println("UserName is :"+ name);
		out.println("Password is :"+pwd);
		
		request.setAttribute("cont","India");
		
		RequestDispatcher ds = request.getRequestDispatcher("Display");
		ds.forward(request,response);
		
		
  	}


public void destroy()
{
	System.out.println("We are in Destroy method");
}
}
