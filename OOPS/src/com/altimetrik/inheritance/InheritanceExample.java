package com.altimetrik.inheritance;

import java.util.Scanner;

public class InheritanceExample {

	// Bank Statement Application
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Customer Id : ");
		Integer customerId = scanner.nextInt();
		System.out.println("Enter Customer Name : ");
		String customerName = scanner.nextLine();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter Customer Type (Enterprise/Regular) : ");
		String customerType = scanner.nextLine();
		System.out.println("Enter Principal Amount : ");
		Double principal = scanner.nextDouble();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter Rate of Interest : ");
		Double rate = scanner.nextDouble();
		scanner.nextLine(); // Consume the newline character
		System.out.println("Enter Time in Years : ");
		Integer time = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character

		if (customerType.equalsIgnoreCase("Enterprise")) {
			System.out.println("Enter Enterprise Type (Small/Medium/Large) : ");
			String enterpriseType = scanner.nextLine();
			// Create an instance of EnterpriseCustomer
			// and calculate the discounted simple interest
			EnterpriseCustomer customer = new EnterpriseCustomer(customerId, customerName, enterpriseType, principal);
			System.out.println(customer.getDiscountedSimpleInterest(rate, time));
		} else if (customerType.equalsIgnoreCase("Regular")) {
			System.out.println("Enter Regular Type (Domestic/Business) : ");
			String regularType = scanner.nextLine();
			// Create an instance of RegularCustomer
			// and calculate the discounted simple interest
			RegularCustomer customer = new RegularCustomer(customerId, customerName, regularType, principal);
			System.out.println(customer.getDiscountedSimpleInterest(rate, time));
		} else {
			System.out.println("Invalid Customer Type");
			scanner.close();
			return;
		}
		scanner.close();

	}

}
