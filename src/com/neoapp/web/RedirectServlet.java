package com.neoapp.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import javax.servlet.ServletException;

public class RedirectServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException
    {
        try {
			response.sendRedirect("date");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}