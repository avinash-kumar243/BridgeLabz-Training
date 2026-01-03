package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {
	protected int fuelTankCapacity;

	public PetrolVehicle(int maxSpeed, String model, int fuelTankCapacity) {
		super(maxSpeed, model);
		this.fuelTankCapacity = fuelTankCapacity;
	}
	
	public void refuel() {
		System.out.println("Petrol vehicle is refueling at the fuel station.");
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Fuel tank full capacity: " + fuelTankCapacity);
	}
}