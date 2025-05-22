package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "admin");
		
			Statement stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee ;");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " : "+rs.getString(2)+" : "+ rs.getInt(4) + " : "+rs.getInt("Age")+" :"+rs.getString(5));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
