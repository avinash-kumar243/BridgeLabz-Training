package com.interfaces.defaultmethods.smartvehicledashboard;

public class ElectricVehicle implements Vehicle {
	private int batteryPercentage;
	
	public ElectricVehicle(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	
	@Override
	public void displaySpeed() {
		System.out.println("\nElectric vehicle speed: good");
	}
	
	@Override
	public void displayBatteryPercentage() {
		System.out.println("Battery percentage: " + batteryPercentage); 
	}
}