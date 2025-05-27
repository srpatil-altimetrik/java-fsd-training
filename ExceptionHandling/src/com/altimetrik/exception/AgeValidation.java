package com.altimetrik.exception;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid age: " + e.getMessage());
		}
	}

	private static void validateAge(int age) throws InvalidAgeException {
		// TODO Auto-generated method stub
		if (age < 0) {
			throw new InvalidAgeException("Age can't ne negative");
		} else if (age < 18) {
			throw new InvalidAgeException("Age must be at least 18");
		} else {
			System.out.println("Age is valid: " + age);
		}
	}

}
