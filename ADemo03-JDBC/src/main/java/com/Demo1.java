package com;
import java.sql.*;
public class Demo1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...!");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "admin");
			System.out.println("COnnectetion Credated ...!");
			Statement stmt= con.createStatement();
			stmt.execute("insert into Employee values(11,'Thanesh',27,50000,'Develper')");
			stmt.close();con.close();
			System.out.println("Data Inserted Succssfully....!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
