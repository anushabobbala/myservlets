// LoginServlet.java
package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userName = request.getParameter("uname");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title> Form Demo </title>");
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