package com.altimetrik.abstraction;

public abstract class CarAbstractClass {
	// Abstract method to start car
    public abstract void start();
    // Abstract method to stop car
    public abstract void stop();
    public abstract void drive();
    
    // Concrete method to display fuel status
    public void displayFuelStatus() {
		System.out.println("Fuel status is good.");
	}
}
