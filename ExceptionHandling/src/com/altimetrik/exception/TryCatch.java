package com.altimetrik.exception;

// This class is a placeholder for the Try-Catch example.

public class TryCatch {
	public static void main(String[] args) {
		try {
			int num = 10;
			int result = num / 0; // This will throw ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
			e.printStackTrace(); // Print the stack trace for debugging
		} finally {
			System.out.println("This block always executes, regardless of an exception.");
		}
	}
	
	//What is Try-Catch
	// A try-catch block is a mechanism in Java to handle exceptions gracefully.
	// It allows you to write code that might throw an exception inside the try block,
	// and if an exception occurs, the control is transferred to the catch block,
	// where you can handle the exception appropriately. The finally block, if present,
	// is executed after the try and catch blocks, regardless of whether an exception
	// was thrown or not. This is useful for cleanup operations, such as closing resources
	// or releasing locks. The try-catch mechanism helps in maintaining the normal flow
	// of the program even when unexpected errors occur, allowing developers to provide
	// meaningful error messages or take corrective actions instead of letting the program crash.
	
	// Why Use Try-Catch
	// 
	
}
