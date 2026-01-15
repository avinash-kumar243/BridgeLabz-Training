package com.trafficmanager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Traffic traffic = new Traffic();		
	
		while(true) {
			System.out.println("\nEnter 1 to view all cars");
			System.out.println("Enter 2 to add a car");
			System.out.println("Enter 3 to remove a car");
			System.out.println("Enter 4 to exit");
			
			int choice = sc.nextInt();
			
			String number;
			switch(choice) {
				case 1:
					traffic.printCarDetails();
					break;
					
				case 2:
					System.out.println("Enter a car number: ");
					number = sc.next();
					
					traffic.addCar(new Vehicle(number)); 
					break;
					
				case 3: 
					System.out.println("Enter a car number: ");
					number = sc.next();
					traffic.removeCar(number);
					break;
					
				default:
					System.out.println("Come again");
					return;
			}
		}
	}
}