package com.altimetrik.interfaces;

public class UpiPayment implements Payment {

	private String upiId;
	
	public UpiPayment(String upiId) {
		super();
		this.upiId = upiId;
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("The payment of " + amount + " paid via UPI using the UPI ID : " + upiId);
	}

}
