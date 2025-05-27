package com.altimetrik.exception;

import java.util.Scanner;

public class ExceptionExample {
	
	public static void evenOdd(int num){
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			throw new ArithmeticException("Number is not even");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int num  = sc.nextInt();
			evenOdd(num);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An exception occurred: " + e.getMessage());
		}
	}
}
