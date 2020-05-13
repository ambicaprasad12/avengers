package com.hexa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
public class Forms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='MyServlet'>");
		
		out.println("Enter the UserNmae : ");
		out.println("<input type='text' name='user'>");
		

		out.println("Enter the Password : ");
		out.println("<input type='password' name='pass'>");
		
		
		out.println("<input type='submit' value='Login'>");
		
		
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
