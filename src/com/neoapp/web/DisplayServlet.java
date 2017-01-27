package com.neoapp.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayServlet extends HttpServlet
{

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        String userName = request.getParameter("uname");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title> Form Demo </title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.print("<H1> Welcome: " + userName + "</H1>");
        out.println("</body>");
        out.println("</html>");
    }
}