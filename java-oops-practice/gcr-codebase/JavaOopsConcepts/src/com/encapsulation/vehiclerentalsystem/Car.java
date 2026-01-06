package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle {
		
	public Car(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
		super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
	}

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days + 1000;
	}
 
	@Override
	public double calculateInsurance() {
		return 2000;
	}

	@Override
	public String getInsuranceDetails() {
		return "Car Insurance Ploicy: " + getInsurancePolicyNumber();
	}
}