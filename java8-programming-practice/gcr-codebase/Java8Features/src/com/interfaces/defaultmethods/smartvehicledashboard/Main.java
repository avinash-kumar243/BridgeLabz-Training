package com.interfaces.defaultmethods.smartvehicledashboard;

public class Main {
	public static void main(String[] args) {
		Vehicle petrolVehicle = new PetrolVehicle();
		Vehicle dieselVehicle = new DieselVehicle();
		Vehicle cngVehicle = new CNGVehicle();
		Vehicle electricVehicle = new ElectricVehicle(56); 
		
		petrolVehicle.displaySpeed();
		petrolVehicle.displayBatteryPercentage();
		
		dieselVehicle.displaySpeed();
		dieselVehicle.displayBatteryPercentage();
		
		cngVehicle.displaySpeed();
		cngVehicle.displayBatteryPercentage();
		
		electricVehicle.displaySpeed();
		electricVehicle.displayBatteryPercentage();
	}
}