package com;

import java.sql.*;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...!");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "admin");
			System.out.println("COnnectetion Credated ...!");
			PreparedStatement stmt = con.prepareStatement("delete from employee where  uid = ? ");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ID :"); int uid = sc.nextInt();
			System.out.println("Do youRealry Want to Delete ? Yes  / NO ");
			String choice = sc.next();
			
			if(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
				stmt.setInt(1, uid);
				stmt.execute();	
			}
			else {
				System.out.println("Data not Dleeted ...!");
			}
			stmt.close();con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
