package com.altimetrik.abstractclass;

public abstract class AbstractClass {
	
	// Concrete method with implementation
	// This method has a body and can be called directly
	// It provides a default behavior that can be used by subclasses
	// It is not abstract, so it does not need to be implemented by subclasses
	// It can be overridden by subclasses if they want to change the behavior
	// It is a method that can be used by subclasses without modification
	// It is a method that provides a common functionality for all subclasses
	// It is a method that can be called on an instance of this class or its subclasses
	
	public void displayMessage() {
		System.out.println("This is an abstract class method.");
	}
	
	// Abstract method without implementation
	// Subclasses must provide an implementation for this method
	// This method is abstract and must be implemented by subclasses
	// It cannot have a body in this class
	// It is used to enforce a contract for subclasses
	// it is a placeholder for a method that must be defined in subclasses
	// It allows subclasses to provide their own implementation
	// It is used to achieve abstraction in Java
	// It is a method that does not have a body in this class
	// It is a method that must be implemented by subclasses
	// It is a method that defines a contract for subclasses
	// It is a method that allows subclasses to provide their own behavior
	public abstract void abstractMethod();
	
}
