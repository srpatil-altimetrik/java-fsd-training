package com.altimetrik.abstraction;

public class PetrolCar extends CarAbstractClass {

	// PetrolCar class extends CarAbstractClass and provides implementation for
	// abstract methods
	// It can also have its own specific methods and properties related to petrol
	// cars.
	// This class represents a concrete implementation of a car that runs on petrol.
	// It inherits the abstract methods from CarAbstractClass and provides concrete
	// implementations for them.
	// Additionally, it can have its own specific methods and properties related to
	// petrol cars.
	// This class can be used to create objects that represent petrol cars and
	// interact with them through the methods defined in CarAbstractClass.
	// Properties specific to PetrolCar
	private String engineType;
	private int fuelCapacity; // in liters
	private double mileage; // in km/l

	// Constructor to initialize PetrolCar properties
	public PetrolCar(String engineType, int fuelCapacity, double mileage) {
		this.engineType = engineType;
		this.fuelCapacity = fuelCapacity;
		this.mileage = mileage;
	}

	// Getters and Setters for PetrolCar properties
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Petrol car started with engine type: " + engineType);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Petrol car stopped.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving petrol car with mileage: " + mileage + " km/l");
	}
	
	@Override
	public void displayFuelStatus() {
		// TODO Auto-generated method stub
		System.out.println("Petrol car fuel capacity: " + fuelCapacity + " liters");
		System.out.println("Petrol car mileage: " + mileage + " km/l");
		System.out.println("Petrol car engine type: " + engineType);
	}

}
