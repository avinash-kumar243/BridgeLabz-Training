package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Vehicle v1 = new Car("CAR101", 2500, "A");
		Vehicle v2 = new Car("CAR102", 2000, "B");
		Vehicle v3 = new Car("CAR103", 3500, "C");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		
		int rentalDays = 5;
		
		System.out.println("Vehicle rental & Insurance summary\n");
		
		for(Vehicle vehicle : list) {
			vehicle.displayDetails(rentalDays);
		}
	}
}