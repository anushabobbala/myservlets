// DB.java
package com.neoapp.web;

import java.sql.*;

public class DB {
	private Connection con;

	
	
	private static final String MYSQL_CON_STR = "jdbc:mysql://localhost:3306/employee?user=root&password=msql";

	public DB() {
		
		try { // DriverManager.registerDriver(new OracleDriver());

			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			con = DriverManager.getConnection(MYSQL_CON_STR);
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
	}
	
	
	
	public Connection getConnection() {
		return con;
	}
}