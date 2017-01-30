package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;

public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Session Demo </title>");
		out.println("</head>");
		out.println("<body bgcolor=\"white\">");

		HttpSession session = request.getSession(false);

		if (session != null) {
			String id = session.getId();
			out.print("<H3>Session ID = " + id + "</H3>");

			long ct = session.getCreationTime();
			String cdate = new Date(ct).toString();
			out.print("<H3>Session Creation Time = " + cdate + "</H3>");

			long lt = session.getLastAccessedTime();
			String ldate = new Date(lt).toString();
			out.print("<H3>Session Last Accessed Time = " + ldate + "</H3>");

			out.print("<H3>Current Time = " + new Date() + "</H3>");

			int mii = session.getMaxInactiveInterval();
			out.print("<H3>Session Max Inactive Interval = " + mii + "seconds</H3>");

			session.invalidate();
		}

		out.print("<H1>Logout Successfully!</H1>");
		out.println("</body>");
		out.println("</html>");
	}
}
