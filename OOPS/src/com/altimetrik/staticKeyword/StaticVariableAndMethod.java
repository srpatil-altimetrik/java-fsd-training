package com.altimetrik.staticKeyword;

// Static variables and methods are associated with the class itself rather than instances of the class.
// They can be accessed without creating an instance of the class.
// Static variables are shared among all instances of the class, while static methods can be called without an instance.
// Static variables and methods are often used for constants or utility functions that do not require instance-specific data.
// Example of a class with static variables and methods
public class StaticVariableAndMethod {

	// Static variable
	Integer interest = 10;

	// Static method
	public static void displayInterestRate(Integer interest) {
		System.out.println("Displaying interest rate from static method");
		System.out.println("Interest rate is " + interest + "%");
	}

	public static void main(String[] args) {
		System.out.println("Loaded StaticVariableAndMethod class");
		// Accessing static method without creating an instance
				StaticVariableAndMethod.displayInterestRate(100); // Calling static method to display interest rate
		// Accessing static variable through an instance
		StaticVariableAndMethod svm = new StaticVariableAndMethod();
		System.out.println("Interest rate from instance: " + svm.interest + "%"); // Accessing static variable through instance														
		// Accessing static method without creating an instance
		StaticVariableAndMethod.displayInterestRate(100); // Calling static method to display interest rate
		Integer principal = 10000;
		Integer time = 2; // in years
		Integer rate = svm.interest; // Using the static variable interest
		System.out.println(rate); // and but it not changing the static variable value
		// Calculating simple interest
		Integer simpleInterest = (principal * rate * time) / 100; // Simple Interest formula
		System.out.println(
				"Simple Interest for " + principal + " at " + rate + "% for " + time + " years is: " + simpleInterest);
	}
}
