package com.altimetrik.abstractclass;

public class Main extends AbstractClass {
	
	public static void main(String[] args) {
		Main main = new Main();
		// Calling the abstract method implemented in Main class
		// This will invoke the displayMessage method
		// The displayMessage method is defined in the AbstractClass
		main.displayMessage();	
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		// This method must be implemented as it is abstract in the parent class
		System.out.println("This is the implementation of the abstract method.");
	}
}
