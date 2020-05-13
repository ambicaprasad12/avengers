package com.hexa;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		
		String pass=request.getParameter("pass");
	
		String loc=request.getParameter("loc");
		
		String locc="India";
		
		if((name.equals("uma"))&&(pass.equals("uma")))
		{
			response.sendRedirect("Index?name="+name+"&locc="+locc);
			

		}
		else {
			response.sendRedirect("Index?name="+name+"&locc="+loc);
			
		}

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
