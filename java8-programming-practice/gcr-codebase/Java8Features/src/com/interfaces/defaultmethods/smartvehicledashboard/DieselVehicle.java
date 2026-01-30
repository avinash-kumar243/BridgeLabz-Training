package com.interfaces.defaultmethods.smartvehicledashboard;

public class DieselVehicle implements Vehicle {

	@Override
	public void displaySpeed() {
		System.out.println("\nDiesel vehicle speed: higher"); 
	}
}