// ViewServlet.java
package com.neoapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read the modified request object to get emp bean
		Emp obj = (Emp) request.getAttribute("emp");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD><TITLE>Employee Details</TITLE></HEAD>");
		out.println("<BODY>");

		if (obj != null) {
			String eno = obj.getNo();
			String ename = obj.getName();
			float esal = obj.getSalary();

			out.println("Employee No: " + eno + "<BR>");
			out.println("Employee Name: " + ename + "<BR>");
			out.println("Employee Salary: " + esal);
		} else {
			out.println("Employee Details are not available in DB");
		}
		out.println("</BODY></HTML>");
	}
}
