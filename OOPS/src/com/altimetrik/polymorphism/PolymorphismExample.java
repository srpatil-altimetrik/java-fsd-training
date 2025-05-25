package com.altimetrik.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// Method Overloading
		PriceCalculator priceCalculator = new PriceCalculator();

		System.out.println("Price with base price only: " + priceCalculator.calculatePrice(100000.0));
		System.out.println("Price with base price and tax: " + priceCalculator.calculatePrice(100000.0, 0.2)); // 20% tax
		System.out.println(
				"Price with base price, tax, and discount: " + priceCalculator.calculatePrice(100000.0, 0.5, 0.2)); // 20% tax and 0.5 discount
		
		
		//Method Overriding
		Property house = new House(); // Upcasting to Property type
		Property apartment = new Apartment(); // Upcasting to Property type
		Property commercial = new Commertial(); // Upcasting to Property type
		System.out.println("House Property Type: " + house.getPropertyType()); // Calls House's overridden method
		System.out.println("Apartment Property Type: " + apartment.getPropertyType()); // Calls Apartment's overridden method
		System.out.println("Commercial Property Type: " + commercial.getPropertyType()); // Calls Commercial's overridden method
		Property property = new Property(); // Base class instance
		System.out.println("Base Property Type: " + property.getPropertyType()); // Calls Property's method
	}
}
