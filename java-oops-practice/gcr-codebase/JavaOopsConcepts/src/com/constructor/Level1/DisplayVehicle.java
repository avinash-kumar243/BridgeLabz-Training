package com.constructor.Level1;

public class DisplayVehicle {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Allu", "BMW");
		Vehicle vehicle2 = new Vehicle("Munna", "Thar");
		Vehicle vehicle3 = new Vehicle("Golu", "Scorpio");
		
		// Instance methods are called through objects
		vehicle1.displayVehicleDetails();
		vehicle2.displayVehicleDetails();
		vehicle3.displayVehicleDetails();
		
		// Class method is called through Class
		Vehicle.printRegistrationFee();
		Vehicle.updateRegistrationFee(1000);
		Vehicle.printRegistrationFee();
	}
}