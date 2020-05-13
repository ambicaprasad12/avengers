package com.hexa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Display
 */
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		   int num1 =(Integer)session.getAttribute("one");
		   int num2 =(Integer)session.getAttribute("two");
		   int num3 =(Integer)session.getAttribute("Result");
		   out.println("First Value is :  "+num1);
		   out.println("second Value is :  "+num2);
		   out.println("Added output is :  "+num3);
		   session.removeAttribute("one");
		   
		   String  num11 =(String)session.getAttribute("one");
		if(num11 !=null) {
			int val = Integer.parseInt(num11);
			out.println("After removing the data" +val);
		}
		else
		   out.println("Sorry no data is available");
			
	}

}
