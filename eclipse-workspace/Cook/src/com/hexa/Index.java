package com.hexa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inbox
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		System.out.println(name);
		String loc=request.getParameter("locc");
		PrintWriter ps=response.getWriter();
		ps.println("<html>");
		ps.println("<body>");
		ps.println("welcome  "+name);
		ps.println("welcome to "+loc);
		ps.println("</body>");
		ps.println("</html>");
		
	
		
	}

}
