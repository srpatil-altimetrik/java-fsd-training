package com.altimetrik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection1 {
	private static final String URL = "jdbc:mysql://localhost:3306/java_training";
	private static final String USER = "root";
	private static final String PASSWORD = "admin";

	public static Connection getConnection1() throws SQLException {
		System.out.println("Connection established");
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
