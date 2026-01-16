package com.insertionsort.shelfloadingrobot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Robot robot = new Robot();
		
		
		System.out.println("\n---------------------Shelf Loading Robots---------------------\n");
		int choice;
		while(true) {
			
			while(true) {	
				System.out.println("\nEnter 1 to view all packages");
				System.out.println("Enter 2 to add a package");
				System.out.println("Enter 3 to sort packages");
				System.out.println("Enter 5 to exit");
				
				if(sc.hasNextInt()) {
					choice = sc.nextInt();
					break;
				} else {
					System.out.println("Please enter an integer number");
					sc.next();
				}
			}
			
			String packageId;
			double packageWeight;
			
			switch(choice) {
				case 1: 
					robot.showPackages();
					break;
					
				case 2:
					System.out.println("Enter package id: ");
					packageId = sc.next();					
					
					while(true) {
						System.out.println("Enter package weight: ");
						if(sc.hasNextInt()) {
							packageWeight = sc.nextDouble();
							break;
						} else {
							System.out.println("Enter valid weight");
							sc.next();
						}
					} 
					
					robot.addPackage(packageId, packageWeight);
					break;
					
				case 3:
					robot.sortPackages();
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