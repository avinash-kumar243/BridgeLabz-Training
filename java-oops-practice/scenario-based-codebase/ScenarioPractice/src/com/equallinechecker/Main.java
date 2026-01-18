package com.equallinechecker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LineOperation action = new LineOperation();
		
		System.out.println("\n------------- A System that will compare two lines and tells who is longer -------------");
		
		
		int choice;
		double x1, x2, y1, y2;
		while(true) {
			System.out.println("\nEnter 1 to view both lines details: ");
			System.out.println("Enter 2 to add lines: ");
			System.out.println("Enter 3 to compare length of both lines: ");
			System.out.println("Enter 2 to exit: ");

			
			try {
				choice = sc.nextInt();
			} catch(Exception e) {
				System.out.println("Please enter a valid number: ");
				sc.nextLine();
				continue;
			}
			
			
			switch(choice) {
				case 1:
					action.showLineDetails();
					break;
					
				case 2:
					if(action.lines.size() == 2) {
						System.out.println("2 lines already present");
						continue;
					}
					
					System.out.println("Enter line cordinates - x1, y1, x2, y2: ");
					while(true) {
						try {
							x1 = sc.nextDouble();
							y1 = sc.nextDouble();
							x2 = sc.nextDouble();
							y2 = sc.nextDouble();
							break;
						} catch(Exception e) {
							System.out.println("Please enter a positive number");
							sc.nextLine();
							continue;
						}
					}
					
					action.addLine(new Line(x1, y1, x2, y2));
					break;
					
				case 3:
					if(action.lines.size() < 2) {
						System.out.println("Please make sure that you have 2 enough lines to compare length");
						continue;
					}
					
					action.compareLines();
					break;
					
				case 4:
					System.out.println("Thank you");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}