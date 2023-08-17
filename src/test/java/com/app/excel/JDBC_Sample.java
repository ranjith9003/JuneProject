package com.app.excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Sample {
	

	public static void dbconnection() {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager
    .getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Saikalai@123");
	System.out.println("connected");
	Statement createStatement = conn.createStatement();
	String query = "SELECT * FROM sampleone.departments ;";
	ResultSet rs = createStatement.executeQuery(query);
	while (rs.next()) {
		System.out.println(rs.getString("department_id"));
		
	}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		dbconnection();
	}

}
