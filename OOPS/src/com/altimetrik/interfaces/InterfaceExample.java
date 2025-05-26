package com.altimetrik.interfaces;

public class InterfaceExample {
	public static void main(String[] args) {
		// Using Interface and their implementation
		Payment cashPayment = new CashPayment();
		cashPayment.pay(1000);

		System.out.println("++++++++++++++++++++++++++++");

		Payment upiPayment = new UpiPayment("user@upi.in");
		upiPayment.pay(2000);
	}
}
