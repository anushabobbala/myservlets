// DB.java
package com.neoapp.web;

import java.sql.*;

public class DB {
	private Connection con;

	public DB() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
	}

	public Connection getConnection() {
		return con;
	}
}