package com.hexa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
	   	String desig =request.getParameter("desig");
		Cookie c=new Cookie("user",name);
		Cookie c1=new Cookie("designation",desig);
		response.addCookie(c);
		response.addCookie(c1);
		
	  	response.getWriter();
	response.sendRedirect("CookieDisplay");
	}

}