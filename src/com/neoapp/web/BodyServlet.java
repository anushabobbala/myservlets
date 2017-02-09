package com.neoapp.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;
import java.io.IOException;

public class BodyServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
    {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<HTML>");
      out.println("<HEAD><TITLE> A Title to this body</TITLE></HEAD>");
      out.println("<BODY>");

      RequestDispatcher rd1 =request.getRequestDispatcher("header");
      rd1.include(request,response);

      out.println("<H1> I'm the Body of this Page </H1>");

      RequestDispatcher rd2 =request.getRequestDispatcher("fotter");
      rd2.include(request,response);

      out.println("</BODY> </HTML>");
    }
}






