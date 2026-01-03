package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Main {
	public static void main(String[] args) {
		System.out.println("\n-------- Electric Vehicle --------");
		ElectricVehicle e1 = new ElectricVehicle(120, "Tesla Model 3", 75);
		e1.charge();
		e1.showDetails();
		
		System.out.println("\n-------- Petrol Vehicle --------");
		PetrolVehicle p1 = new PetrolVehicle(120, "Tesla Model 3", 12);
		p1.refuel();
		p1.showDetails();
	}
}