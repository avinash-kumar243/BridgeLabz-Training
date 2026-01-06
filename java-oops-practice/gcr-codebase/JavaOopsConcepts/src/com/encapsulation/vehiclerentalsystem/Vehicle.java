package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle implements Insurable {
	protected String vehicleNumber;
	protected String type;
	protected double rentalRate;
	
	private String insurancePolicyNumber;
	
	public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	
	public abstract double calculateRentalCost(int days);
	
	public String getType() {
		return type;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	protected double getRentalRate() {
		return rentalRate; 
	}
	protected String getInsurancePolicyNumber() {
		return insurancePolicyNumber; 
	}
 
	public void displayDetails(int days) {
		System.out.println("Vehicle Number: " + vehicleNumber);
		System.out.println("Vehicle Type: " + type);
		System.out.println("Rental rate(per day): " + rentalRate);
		System.out.println("Rental Cost for " + days + " days: " + calculateRentalCost(days));
		System.out.println("Insurance Cost: " + calculateInsurance());
		System.out.println(getInsuranceDetails() + "\n");
	}
}