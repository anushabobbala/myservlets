// Model.java
package com.neoapp.web;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	public Emp getEmployee(String no) throws SQLException {
		DB dbObj = new DB();
		Connection con = dbObj.getConnection();
		Statement stmt = con.createStatement();
		String query = "select * from emp where employeenumber='" + no + "'";
		ResultSet rs = stmt.executeQuery(query);
		if (rs.next()) {
			no = rs.getString("employeenumber");
			String name = rs.getString("employeename");
			float sal = rs.getFloat("salary");

			Emp obj = new Emp();
			obj.setNo(no);
			obj.setName(name);
			obj.setSalary(sal);

			return obj;
		} else {
			return null;
		}
	}

	public Emp[] getEmployees() {
		return null;
	}
}
