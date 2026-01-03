package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle{
	protected int batteryCapacity;
	
	public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
		super(maxSpeed, model);
		this.batteryCapacity = batteryCapacity;
	}

	public void charge() {
		System.out.println("Elcetric vehicle is charging using battery power.");
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Battery Capacity: " + batteryCapacity);
	}
}