package com.hexa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<body>");
out.println("<form method='get' action='MyUrl'>");

out.println("Enter the User Name : ");
out.println("<input type='text' name='name'>");


out.println("Enter the Password : ");
out.println("<input type='Password' name='pass'>");

out.println("Enter the location : ");
out.println("<input type='text' name='loc'>");



out.println("<input type='submit' value='Login'>");


out.println("</form>");
out.println("</body>");
out.println("</html>");
}

}
