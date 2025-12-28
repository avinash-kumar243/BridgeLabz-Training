package com.constructor.Level1;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private static double registrationFee = 500;
	
	// Parameterized Constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// Instance method
	public void displayVehicleDetails() {
		System.out.println("\nVehicle owner name is : " + ownerName);
		System.out.println("Vehicle type is : " + vehicleType);
	}
	
	// Class methods
	public static void printRegistrationFee() {
		System.out.println("\nRegistration fee is : " + registrationFee);
	}
	public static void updateRegistrationFee(double fee) {
		registrationFee = fee;
	}
}