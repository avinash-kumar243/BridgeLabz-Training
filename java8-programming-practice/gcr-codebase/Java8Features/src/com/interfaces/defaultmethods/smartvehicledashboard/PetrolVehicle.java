package com.interfaces.defaultmethods.smartvehicledashboard;

public class PetrolVehicle implements Vehicle {
	
	@Override
	public void displaySpeed() {
		System.out.println("\nPetrol Vehicle speed: medium");
	}
}