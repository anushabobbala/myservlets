// ControllerServlet.java
package com.neoapp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Read input (emp no) from Browser
		String no = request.getParameter("eno");

		// Instantiate Model Object to get emp details
		Model model = new Model();

		Emp empBean = null;
		try {
			empBean = model.getEmployee(no);
		} catch (Exception e) {
		}

		// Modify request object with emp bean
		request.setAttribute("emp", empBean);

		// Forward the modified request to the View
		RequestDispatcher rd = request.getRequestDispatcher("view");
		rd.forward(request, response);
	}
	
}
