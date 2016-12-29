package com.neoapp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        //Set Content Type
        response.setContentType("text/html");

        // Open IO stream to write HTML data
        PrintWriter out = response.getWriter();

        // Write HTML Codeaz
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello Program</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello Anusha!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
