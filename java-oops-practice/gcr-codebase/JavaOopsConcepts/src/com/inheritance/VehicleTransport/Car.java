package com.inheritance.VehicleTransport;

public class Car extends Vehicle {
	protected int seatCapacity;
	
	public Car(int seatCapacity, int maxSpeed, String fuelType) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Car Info:");
		System.out.println("Max Speed: " + maxSpeed + " km/h");
		System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
	}
}