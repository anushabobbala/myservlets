// DisplayServlet.java
package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServletC extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = null;
		// Read all the Cookies sent by the browser using request object
		Cookie[] cookies = request.getCookies();

		// Find out the cookie that is having the name "user" by traversing the
		// array
		for (int i = 0; i < cookies.length; i++) {
			System.out.println(cookies[i].getName());

			// Get the cookie value for the cookie name "user"
			if (cookies[i].getName().equals("user")) {
				userName = cookies[i].getValue();
			}
		}
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Cookie Demo </title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		out.print("<H1>Welcome " + userName + "</H1>");
		out.println("</body>");
		out.println("</html>");
	}
}
