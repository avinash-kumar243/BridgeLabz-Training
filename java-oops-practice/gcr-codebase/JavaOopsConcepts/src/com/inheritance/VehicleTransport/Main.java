package com.inheritance.VehicleTransport;

public class Main {
	public static void main(String args[]) {
		Vehicle[] vehicle = {new Car(180, 5, "Petrol"),
							 new Truck(120, 125, "Diesel"),
							 new Motorcycle(140, 150, "Petrol")
		};
		
		for(Vehicle v : vehicle) {
			v.displayInfo();
			System.out.println();
		}
	}
}