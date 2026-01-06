package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle {

	public Bike(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}

	@Override
	public double calculateInsurance() {
		return 1000;
	}

	@Override
	public String getInsuranceDetails() {
		return "Bike Insurance policy : " + getInsurancePolicyNumber();
	}
}