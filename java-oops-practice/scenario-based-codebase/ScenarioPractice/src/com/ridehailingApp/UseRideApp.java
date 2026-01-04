package com.ridehailingApp;

import java.util.Scanner;
public class UseRideApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			Driver d1 = new Driver("Aman", "LICENSE123", 4.2);
			Vehicle v1;
			
			System.out.print("\nEnter your destination distance: ");
			int distance = sc.nextInt();
			
			System.out.print("\nEnter 1 for booking Mini, 2 for Suv, or 3 for Sedan: ");
			int choice = sc.nextInt();
			
			while(choice <= 0 || choice > 3) {
				System.out.println("Invalid choice!!!\n");
				System.out.print("Please enter 1 for booking Mini, 2 for Suv, or 3 for Sedan: ");
				choice = sc.nextInt();
			}
			
			if(choice == 1) v1 = new Mini(distance);
			else if(choice == 2) v1 = new Suv(distance);
			else v1 = new Sedan(distance);
			
			v1.showDetails();
			
			System.out.print("Please conform ride booking - by pressing 1 for Yes and 0 for No: ");
			int rideConformation = sc.nextInt();
			
			while(rideConformation < 0 || rideConformation > 1) {
				System.out.println("Invalid choice!!! \n");
				System.out.print("Please conform ride booking - by pressing 1 for Yes and 0 for No: ");
				rideConformation = sc.nextInt();
			}
			
			if(rideConformation == 1) {
				RideService r1 = new RideService(d1, v1);
				r1.bookRide(distance);
				
				System.out.println("\nRide completed.");
				r1.endRide();
			} else {
				System.out.println("Ride booking cancled! \n");
			}
			
			System.out.print("\nPress 1 to book another vehicle else 0 to terminate program: ");
			int chance = sc.nextInt();
			
			while(chance < 0 || chance > 1) {
				System.out.println("Invalid choice!!! \n");
				System.out.print("\nPlease press 1 to book another vehicle else 0 to terminate program: ");
				chance = sc.nextInt();
			}
			
			if(chance == 0) {
				System.out.println("\nThanku. Ride booking App is closed");
				System.exit(0);
			}
		}
	}
}