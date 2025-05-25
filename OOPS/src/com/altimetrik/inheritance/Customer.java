package com.altimetrik.inheritance;

public abstract class Customer {
	Integer customerId;
	String customerName;
	String customerType; // Enterprise or Regular
	// Enterprise -  Small, Medium, Large
	// Regular - Domestic and Business
	public Customer(Integer customerId, String customerName, String customerType) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
	}
	
	abstract double getDiscountedSimpleInterest(Double rate, Integer time);
}
