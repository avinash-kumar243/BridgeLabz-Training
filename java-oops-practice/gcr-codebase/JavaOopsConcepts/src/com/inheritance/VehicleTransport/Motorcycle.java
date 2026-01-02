package com.inheritance.VehicleTransport;

public class Motorcycle extends Vehicle  {
	private int fuelCapacity;
	
	public Motorcycle(int fuelCapacity, int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
		this.fuelCapacity = fuelCapacity;
	}
	
	@Override
    public void displayInfo() {
        System.out.println("Motorcycle Details:");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Fuel capacity: " + fuelCapacity);
    }
}