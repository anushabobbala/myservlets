package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginSServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Read the state from the HTML form submitted data
		String userName = request.getParameter("uname");

		// Get a Session Object
		HttpSession session = request.getSession();

		// store the sate(user name) into session,
		// to make it available to other servlets
		// for the requests received from the same client
		session.setAttribute("user", userName);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title> Session Demo </title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");
		out.println("<H1>Login Successful</H1>");
		out.println("<FORM method=get action=\"./display\">");
		out.println("<BR> <input type=submit value=\"Show User Name\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
