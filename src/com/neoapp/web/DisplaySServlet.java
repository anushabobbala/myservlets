package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplaySServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Get the session Object
		HttpSession session = request.getSession();
		// Get the user state from session
		String userName = (String) session.getAttribute("user");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title> Session Demo </title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		out.print("<H1>Welcome " + userName + "</H1>");
		out.println("</body>");
		out.println("</html>");
	}
}
