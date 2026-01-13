package com.emergencypatientnavigation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		
		System.out.println("\n----------------Emergency Patient Navigation----------------\n");
		while(true) {
			System.out.println("Enter 1 to add Ward");
			System.out.println("Enter 2 to send Ward for maintainance");
			System.out.println("Enter 3 to retrive Ward from maintainance");
//			System.out.println("Enter 4 to ");
			System.out.println("Enter 5 to exit");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
						
			switch(choice) {
				case 1: 
					System.out.println("Enter ward name: ");
					String ward = sc.next();
					hospital.addWard(ward);
					break;
					
				case 2:
					System.out.println("Enter ward name to send for maintenance:");
					String maintainWard = sc.next();
					hospital.goForMaintenance(maintainWard);
					break;

				case 3:
					hospital.retrieveFromMaintenance();
					break;

				case 5:
					System.out.println("Exiting...");
					System.exit(0);
					
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}