package com.altimetrik.abstraction;

public class PetrolCarImpl implements CarInterface {
	private String engineType;
	private int fuelCapacity; // in liters
	private double mileage; // in km/l

	// Constructor to initialize PetrolCar properties
	public PetrolCarImpl(String engineType, int fuelCapacity, double mileage) {
		super();
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
		System.out.println("Fuel status is good.");
	}
}
