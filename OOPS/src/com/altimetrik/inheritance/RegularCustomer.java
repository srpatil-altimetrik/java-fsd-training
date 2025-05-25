package com.altimetrik.inheritance;

public class RegularCustomer extends Customer {
	String customerName;
	Integer customerId;
	String customerType; // Regular - Domestic and Business
	Double amount;

	public RegularCustomer(Integer customerId, String customerName, String customerType, Double amount) {
		super(customerId, customerName, customerType);
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerType = customerType;
		this.amount = amount;
	}

	@Override
	double getDiscountedSimpleInterest(Double rate, Integer time) {
		Double simpleInterest = this.amount * rate * time;
		Double amount = this.amount + simpleInterest;
		amount = amount - 300; // Base discount for all regular customers
		if (this.customerType.equalsIgnoreCase("Domestic")) {
			amount = amount - 200;
		} else if (this.customerType.equalsIgnoreCase("Business")) {
			amount = amount - 100;
		}
		return amount;
	}
}
