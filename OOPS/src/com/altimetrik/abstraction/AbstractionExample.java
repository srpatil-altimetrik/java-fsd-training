package com.altimetrik.abstraction;

public class AbstractionExample {

	// Abstraction can be achieved through abstract classes and interfaces.
	// An abstract class can have both abstract methods (without implementation) and
	// concrete methods (with implementation).
	// An interface can only have abstract methods (until Java 8, which introduced
	// default methods).
	// The main purpose of abstraction is to hide the complex implementation details
	// and show only the essential features of an object.
	// Abstraction helps in reducing programming complexity and effort.
	// Example: A car can be represented as an abstract class or interface, where
	// the details of how the car operates (like engine mechanics) are hidden from
	// the user.
	// The user interacts with the car through methods like start(), stop(), and
	// drive(), without needing to understand the underlying mechanics.

	public static void main(String[] args) {
		
		// Using Abstract Class and their implementation 
		CarAbstractClass car = new PetrolCar("BS4", 4, 70);
		car.displayFuelStatus();
		car.start();
		car.drive();
		car.stop();
		
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println();
		
		CarAbstractClass carDisel = new DiselCar("BS2", 3, 50);
		carDisel.displayFuelStatus();
		carDisel.start();
		carDisel.drive();
		carDisel.stop();
		
		System.out.println();
		System.out.println("++++++++++Using Interface++++++++++");
		System.out.println();
		
	}
}
