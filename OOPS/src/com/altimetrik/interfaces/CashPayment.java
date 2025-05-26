package com.altimetrik.interfaces;

public class CashPayment implements Payment{
	double amount;	
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The payment of " + amount + " paid via Cash.");
	}

}
