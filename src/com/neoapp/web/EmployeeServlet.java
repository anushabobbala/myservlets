package com.neoapp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class EmployeeServlet extends HttpServlet
{
   public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws IOException, ServletException
   {
      String no = req.getParameter("eno");
      String name = req.getParameter("ename");
      String sal = req.getParameter("esal");

      res.setContentType("text/html");
      PrintWriter out = res.getWriter();
      out.println("<HTML><HEAD><TITLE>Emp Demo</TITLE></HEAD><BODY>");
      try
      {
         Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/employee";
         Connection con = DriverManager.getConnection(url,"root","msql");
         PreparedStatement ps = 
           con.prepareStatement("insert into emp values(?,?,?)");
         ps.setString(1, no);
         ps.setString(2, name);
         ps.setString(3, sal);
         int count = ps.executeUpdate();

         out.println("<h3>" + count + "record(s) inserted. </h3>");

         ps.close();
         con.close();
      }
      catch(Exception e)
      {
         out.println("<h3>" + e + "</h3>");
      }
      out.println("</BODY></HTML>");
   }
}


















