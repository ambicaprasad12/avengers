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
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<body>");
out.println("<form method='get' action='MyCookie'>");

out.println("Enter the Name : ");
out.println("<input type='text' name='name'>");


out.println("Enter the designation : ");
out.println("<input type='text' name='desig'>");


out.println("<input type='submit' value='register'>");


out.println("</form>");
out.println("</body>");
out.println("</html>");
}

}
