package com.ridehailingApp;

public abstract class Vehicle {
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	
	public Vehicle(String vehicleNumber, int capcity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capcity;
		this.type = type;
	}
	
	protected void showDetails() {
		System.out.println("\nAssigned Vehicle --> vehicle number: " + vehicleNumber + " || capacity: " + capacity + " || type: " + type); 
	}

	public abstract double calculateFare();
}