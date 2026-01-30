package com.interfaces.defaultmethods.smartvehicledashboard;

public class CNGVehicle implements Vehicle {

	@Override
	public void displaySpeed() {
		System.out.println("\nCNG Vehicle speed: Slow"); 
	}
}