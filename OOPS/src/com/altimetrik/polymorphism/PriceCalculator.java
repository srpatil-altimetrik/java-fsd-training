package com.altimetrik.polymorphism;

public class PriceCalculator {

	// Calculate price with just base price
	public double calculatePrice(double basePrice) {
		return basePrice;
	}

	// Overloaded method with tax
	public double calculatePrice(double basePrice, double tax) {
		return basePrice + (basePrice * tax);
	}

	// Overloaded method with tax and discount
	public double calculatePrice(double basePrice, double tax, double discount) {
		return (basePrice + (basePrice * tax)) - discount;
	}
}
