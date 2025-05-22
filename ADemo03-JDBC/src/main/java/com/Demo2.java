package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...!");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "admin");
			System.out.println("COnnectetion Credated ...!");
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?);");
			Scanner sc = new Scanner(System.in);
			System.out.println("ID :"); int uid = sc.nextInt();
			System.out.println("Name :"); String name = sc.next();
			System.out.println("Age :"); int age = sc.nextInt();
			System.out.println("Salary:"); int salary = sc.nextInt();
			System.out.println("Desig:"); String desig = sc.next();
			stmt.setInt(1, uid);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setInt(4, salary);
			stmt.setString(5, desig);
			
			Thread.sleep(15000);
			stmt.execute();
			stmt.close();con.close();
			System.out.println("Data Inserted Succssfully....!");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
