package com.interfaces.defaultmethods.smartvehicledashboard;

public interface Vehicle {
	
	// Abstract method
	void displaySpeed();
	
	// default method for non-electric vehicles
	default void displayBatteryPercentage() {
		System.out.println("Battery Info not applicable"); 
	}
}