package com.mergersort.vehiclemaintenance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		VehicleScheduler vehicleScheduler = new VehicleScheduler();
		
		
		System.out.println("\n------------------- FleetManager – Vehicle Maintenance Scheduler (Merge Sort) -------------------\n");
		
		String vehicleNumber;
		int choice, mileage;
		while(true) {
			System.out.println("\nEnter 1 to view all vehicle details");
			System.out.println("Enter 2 to add a vehicle");
			System.out.println("Enter 3 to sort vehicles");
			System.out.println("Enter 4 to exit");
			
			// try catch block for valid choice
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch(Exception e) {
				System.out.println("Please choose a valid option");
				sc.nextLine();
				continue;
			}
			
					
			// Perform operation based on choice
			switch(choice) {
				case 1:
					vehicleScheduler.showVehicleDetails();
					break;
					
				case 2:
					System.out.println("Enter Vehicle Number: ");
					vehicleNumber = sc.nextLine();
		
					while(true) {
						try {
							System.out.println("Enter mileage: ");
							mileage = sc.nextInt();
							sc.nextLine();
							break;
						} catch(Exception e) {
							System.out.println("Please enter numeric mileage");
							sc.nextLine();
							continue;
						}
					}
					
					vehicleScheduler.addVehicle(new Vehicle(vehicleNumber, mileage));
					break;
					
				case 3:
					vehicleScheduler.sortVehicle();
					break;
					
				case 4:
					System.out.println("Thank you");
					return;
					
				default:
					System.out.println("Please enter a valid choice");
			}
		}
	}
}