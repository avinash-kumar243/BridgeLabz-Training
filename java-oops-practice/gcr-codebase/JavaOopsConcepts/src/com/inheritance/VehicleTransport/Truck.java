package com.inheritance.VehicleTransport;

public class Truck extends Vehicle  {
	private int loadCapacity;
	
	public Truck(int loadCapacity, int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
		this.loadCapacity = loadCapacity;
	}
	
	@Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}