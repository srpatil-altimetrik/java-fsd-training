package com.altimetrik.abstraction;

public interface CarInterface {
	public void start();
	public void stop();
	public void drive();
	
	public abstract void displayFuelStatus(); // Abstract method to display fuel status
	// In interfaces, all methods are implicitly public and abstract,
	// so you can omit the 'public' and 'abstract' keywords if you prefer.
	// However, it's a good practice to include them for clarity.
	// This method can be used to display the fuel status of the car,
	// which can be implemented in the classes that implement this interface.
	// We don't have any properties in the interface,
	// as interfaces are meant to define a contract for behavior, not state.
	// Classes that implement this interface will provide concrete implementations
	// for these methods, allowing for polymorphism and flexibility in design.
	// Interfaces can also be used to achieve multiple inheritance in Java,
	// as a class can implement multiple interfaces.
	// This allows for a more flexible design, where a class can inherit behavior
	// from multiple sources without being tied to a specific class hierarchy.
	// Note: In Java 8 and later, interfaces can also have default methods with
	// implementation, but this is not the case here as we are focusing on
	// abstract methods for the sake of simplicity and clarity in this example.
	// We don't have the concrete methods in the interface,
	// as interfaces are meant to define a contract for behavior, not state.
}
