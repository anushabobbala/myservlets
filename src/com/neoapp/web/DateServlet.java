package com.neoapp.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;

public class DateServlet extends HttpServlet
{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE> Date Demo </TITLE></HEAD>");
        out.println("<BODY>");

        Date date = new Date();
        String dateStr = date.toString();

        out.println("<h1>"+dateStr+"</h1>");

        out.println("</BODY>");
        out.println("</HTML>");
    }
}


