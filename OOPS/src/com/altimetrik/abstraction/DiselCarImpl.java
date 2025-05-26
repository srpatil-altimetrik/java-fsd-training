package com.altimetrik.abstraction;

public class DiselCarImpl implements CarInterface{

	private String engineType;
	private int fuelCapacity; // in liters
	private double mileage; // in km/l
	// Constructor to initialize DiselCar properties

	public DiselCarImpl(String engineType, int fuelCapacity, double mileage) {
		super();
		this.engineType = engineType;
		this.fuelCapacity = fuelCapacity;
		this.mileage = mileage;
	}

	// Getters and Setters for DiselCar properties
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
		System.out.println("Disel car started with engine type: " + engineType);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Disel car stopped.");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving disel car with mileage: " + mileage + " km/l");
	}

	@Override
	public void displayFuelStatus() {
		// TODO Auto-generated method stub
		System.out.println("Disel car fuel capacity: " + fuelCapacity + " liters");
		System.out.println("Disel car mileage: " + mileage + " km/l");
		System.out.println("Disel car engine type: " + engineType);
		System.out.println("Fuel status is good.");
	}

}
