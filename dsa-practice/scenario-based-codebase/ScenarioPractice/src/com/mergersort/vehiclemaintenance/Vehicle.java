package com.mergersort.vehiclemaintenance;

public class Vehicle {
	private String vehicleNumber;
	private int mileage;
	
	public Vehicle(String vehicleNumber, int mileage) {
		this.vehicleNumber = vehicleNumber;
		this.mileage = mileage;
	}
	
	// Getters for vehicle data
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public int getMileage() {
		return mileage;
	}
	
	
	@Override
	public String toString() {
		return "VehicleNumber: " + vehicleNumber + " || Mileage: " + mileage; 
	}
}