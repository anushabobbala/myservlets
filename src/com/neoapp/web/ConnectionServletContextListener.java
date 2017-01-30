// ConnectionServletContextListener.java
package com.neoapp.web;

import javax.servlet.*;
import java.sql.*;

public class ConnectionServletContextListener implements ServletContextListener {
	Connection con = null;

	public void contextInitialized(ServletContextEvent event) {
		// Get ServletContext object so that we can read web.xml context params
		ServletContext context = event.getServletContext();

		// Read conext parameters to avoid hardcoding
		String driver = context.getInitParameter("driver");
		String conURL = context.getInitParameter("conURL");
		String user = context.getInitParameter("user");
		String password = context.getInitParameter("password");

		System.out.println(driver);
		System.out.println(conURL);
		System.out.println(user);
		System.out.println(password);
		try {
			// Get database connection
			Class.forName(driver);
			con = DriverManager.getConnection(conURL, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		// setting the JDBC Connection in ServletContext object, so that
		// this connection can be accessible by all servlets
		context.setAttribute("db", con);
	}

	public void contextDestroyed(ServletContextEvent event) {
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
