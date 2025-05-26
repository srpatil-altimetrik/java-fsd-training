package com.altimetrik.exception;

public class HowException {
	
	private void method1() {
		method2();
	}
	
	private void method2() {
		method3();
	}

	private void method3() {
		int num =10;
		int result = num / 0; // This will throw ArithmeticException
	}

	public static void main(String[] args) {
		HowException exc = new HowException();
		exc.method1();
	}
	
	// What is Exception
	// An exception is an event that disrupts the normal flow of a program's execution.
	// It is a runtime error that occurs when the program encounters an unexpected condition,
	// such as trying to divide by zero, accessing an invalid index in an array, or
	// attempting to open a file that does not exist. Exceptions can be caught and handled
	// using try-catch blocks, allowing the program to continue running or to terminate gracefully.
	// In Java, exceptions are represented by the Throwable class and its subclasses,
	// with the most common being Exception and RuntimeException. When an exception occurs,
	// it creates an object that contains information about the error, such as its type,
	// message, and stack trace. The stack trace provides a snapshot of the method calls
	// that were active at the time the exception was thrown, helping developers trace
	// the origin of the error and debug the code effectively. 
	
	
	// In the above code, we have a series of method calls: method1() calls method2(),
	// and method2() calls method3(). Inside method3(), we attempt to divide a number by zero,
	// which will throw an ArithmeticException. This exception is not caught within the
	// methods, so it will propagate up the call stack to the main method. If there is no
	// exception handling in the main method, the program will terminate and print the
	// stack trace of the exception, showing the sequence of method calls that led to the
	// exception. This is how exceptions propagate in Java, allowing developers to trace
	// the origin of the error through the call stack.
	// What exception contains - Type of Exception, Message, Stack Trace
	//                          // Type of Exception: ArithmeticException
	//                          // Message: / by zero
	//                          // Stack Trace: Shows the sequence of method calls leading to the exception
	
	
	/*	
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
	 * com.altimetrik.exception.HowException.method3(HowException.java:15) at
	 * com.altimetrik.exception.HowException.method2(HowException.java:10) at
	 * com.altimetrik.exception.HowException.method1(HowException.java:6) at
	 * com.altimetrik.exception.HowException.main(HowException.java:20)
	 */

}
