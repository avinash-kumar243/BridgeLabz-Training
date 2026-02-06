package com.practice.factorypattern;

public class VehicleFactory {
	public static Vehicle createVehicle(String vehicleType) {
		if(vehicleType.equalsIgnoreCase("Car")) {
			return new Car();
		} else if(vehicleType.equalsIgnoreCase("Bike")) {
			return new Bike();
		}
		return null; 
	}
}