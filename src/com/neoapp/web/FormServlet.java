// FormServlet.java
package com.neoapp.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// Reading the HTML Form Parameters
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<HTML><HEAD><TITLE>Form Demo</TITLE></HEAD><BODY>");
		out.println("<H3>First Name =" + firstName + "</H3>");
		out.println("<H3>Last Name =" + lastName + "</H3>");
		out.println("</BODY></HTML>");
	}
}