package com.quicksort.sensordataordering;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DroneSensor droneSensor = new DroneSensor();
		
		
		System.out.println("\n---------------------Movie Time Sorting (Bubble Sort)---------------------\n");
		int choice;
		while(true) {
			
			while(true) {	
				System.out.println("\nEnter 1 to view all measured soil temperature details");
				System.out.println("Enter 2 to add a soil status");
				System.out.println("Enter 3 to sort soil temperatures");
				System.out.println("Enter 4 to exit");
				
				if(sc.hasNextInt()) {
					choice = sc.nextInt();
					break;
				} else {
					System.out.println("Enter a positive number: ");
					sc.next();
				}
			}
			
			
			LocalTime soilMeasuredTime;
			switch(choice) {
				case 1: 
					droneSensor.showSoilTemperature();
					break;
					
				case 2:
					System.out.println("Enter Soil current temperature: ");
					double temperature = sc.nextDouble();
					sc.nextLine();
					
					while(true) {
						try {
							System.out.print("Enter soil temperature measured time (HH:MM:SS) : ");
							String movieTime = sc.nextLine(); 

							soilMeasuredTime = LocalTime.parse(movieTime);
							break;
						} catch(Exception e) {
							System.out.println("Invalid time. Please enter a valid time\n");
						}
					}
					
					droneSensor.measureSoilTemperature(new Soil(temperature, soilMeasuredTime));
					break;
					
				case 3:
					droneSensor.sortSoilTemperature();
					break;
					
				case 4:
					System.out.println("Thank You");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}
