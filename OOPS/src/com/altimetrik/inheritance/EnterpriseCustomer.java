package com.altimetrik.inheritance;

public class EnterpriseCustomer extends Customer{
	
	String customerName;
	Integer customerId;
	String customerType; // Enterprise or Regular
	// Enterprise -  Small, Medium, Large
	Double amount;

	public EnterpriseCustomer(Integer customerId, String customerName, String customerType, Double amount) {
		super(customerId, customerName, customerType);
		// TODO Auto-generated constructor stub
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerType = customerType;	
		this.amount = amount;
		}
	
	@Override
	double getDiscountedSimpleInterest( Double rate, Integer time) {
		// TODO Auto-generated method stub
		Double simpleInterest = this.amount * rate * time;
		Double amount = this.amount + simpleInterest;
		amount = amount - 500; // Base discount for all enterprise customers
		if (this.customerType.equalsIgnoreCase("Small")) {
			amount = amount - 300;
		} else if (this.customerType.equalsIgnoreCase("Medium")) {
			amount = amount - 200;
		} else if (this.customerType.equalsIgnoreCase("Large")) {
			amount = amount - 100;
		}
		return amount;
	}

}
