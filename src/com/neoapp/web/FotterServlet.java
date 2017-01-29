package com.neoapp.web;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class FotterServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<HR>");
        out.println("<H1> I'm from Fotter </H1>");
    }
}