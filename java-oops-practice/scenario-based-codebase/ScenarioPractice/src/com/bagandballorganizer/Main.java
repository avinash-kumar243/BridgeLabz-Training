package com.bagandballorganizer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n------------------ Bag and Ball Organizer -----------------\n");
		
		School school = new School();
		
		
		int choice, bagCapacity;
		while(true) {
			System.out.println("\nEnter 1 to add a bag");
			System.out.println("Enter 2 to add a ball to a bag");
			System.out.println("Enter 3 to remove a ball from a bag");
			System.out.println("Enter 4 to display all balls in a bag");
			System.out.println("Enter 5 to display all bags and their ball count");
			System.out.println("Enter 6 to exit");

			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch(Exception e) {
				System.out.println("Please enter a valid option");
				sc.nextLine();
				continue;
			}
			
			
			
			String bagId, bagColor, ballId, ballColor, ballSize;
			switch(choice) {
				case 1:
					System.out.println("Enter bag id: ");
					bagId = sc.nextLine();
					
					System.out.println("Enter bag color: ");
					bagColor = sc.nextLine();
					
					System.out.println("Enter bag capacity: ");
					
					while(true) {
						try {
							bagCapacity = sc.nextInt();
							break;
						} catch(Exception e) {
							System.out.println("Please enter a valid bag capacity");
							sc.nextLine();
							continue;
						}
					}
					
					school.addBag(new Bag(bagId, bagColor, bagCapacity));
					break;
					
				case 2:
					System.out.println("Enter ball id: ");
					ballId = sc.nextLine();
					
					System.out.println("Enter ball color: ");
					ballColor = sc.nextLine();
					
					System.out.println("Enter ball size: ");
					ballSize = sc.nextLine();
					
					System.out.println("Enter bag id: ");
					bagId = sc.nextLine();
					
					school.addBallToBag(new Ball(ballId, ballColor, ballSize), bagId);
					break;
					
				case 3:
					System.out.println("Enter bag id: ");
					bagId = sc.nextLine();
					
					System.out.println("Enter ball id: ");
					ballId = sc.nextLine();
										
					school.removeBallFromBag(ballId, bagId);
					break;
					
				case 4:
					System.out.println("Enter bag id: ");
					bagId = sc.nextLine();
					
					school.displayAllBallsInBag(bagId);
					break;
					
				case 5:
					school.displayAllBagsAndBallCount();
					break;
					
				case 6:
					System.out.println("Thank you.");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}