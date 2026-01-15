package com.bubblesort.hospitalqueue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Hospital hospital = new Hospital();
		
		
		System.out.println("\n-----------------------Hospital Queue -> Sort Patient by their critical level-------------------------\n");
		while(true) {
			System.out.println("\nEnter 1 to view all sorted patients");
			System.out.println("Enter 2 to add patient");
			System.out.println("Enter 3 to remove patient");
			System.out.println("Enter 4 to sort patients");
			System.out.println("Enter 5 to exit");

			int choice = sc.nextInt();
			
			String name;
			int id, criticalLevel;
			
			switch(choice) {
				case 1: 
					hospital.showAllPatient();
					break;
					
				case 2:
					System.out.print("Enter patient id: ");
					id = sc.nextInt();
					System.out.print("Enter patient critical level between 1 and 10: ");
					criticalLevel = sc.nextInt();
					while(criticalLevel <= 0 || criticalLevel > 10) {
						System.out.println("----------Invalid critical lavel. Please enter between 1 and 10----------");
						criticalLevel = sc.nextInt();
					}
										
					hospital.addPatient(new Patient(id, criticalLevel));
					break;
					
				case 3:
					System.out.print("Enter patient id: ");
					id = sc.nextInt();
					hospital.removePatient(id);
					break;
					
				case 4:
					hospital.sortPatient();
					break;
					
				case 5:
					System.out.println("Program terminated");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}