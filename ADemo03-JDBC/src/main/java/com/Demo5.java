package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...!");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "admin");
			System.out.println("COnnectetion Credated ...!");
			PreparedStatement stmt = con.prepareStatement("update employee set salary = ? where uid = ? ");
			Scanner sc = new Scanner(System.in);
			System.out.println("ID :"); int uid = sc.nextInt();
			System.out.println("Salary:"); int salary = sc.nextInt();
			stmt.setInt(2, uid);
			stmt.setInt(1, salary);
			stmt.execute();
			stmt.close();con.close();
			System.out.println("Data updated  Succssfully....!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
