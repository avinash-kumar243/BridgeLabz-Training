package com.javadesignpattern.practice.factorypattern;

public class Main {
	public static void main(String[] args) {
		
		Vehicle v1 = VehicleFactory.createVehicle("Car");
		Vehicle v2 = VehicleFactory.createVehicle("Bike");
		Vehicle v3 = VehicleFactory.createVehicle("Auto");
		
		try {
			v1.drive();
			v2.drive();
			v3.drive();
		} catch(NullPointerException e) {
			System.out.println("Invalid vehicle type!!!"); 
		}		
	}
}