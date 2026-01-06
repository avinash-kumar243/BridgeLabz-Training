package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle {

	public Truck(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days  + 1500;
	}

	@Override
	public double calculateInsurance() {
		return 5000;
	}

	@Override
	public String getInsuranceDetails() {
		return "Truck Insurance Policy: " + getInsurancePolicyNumber();
	}
}