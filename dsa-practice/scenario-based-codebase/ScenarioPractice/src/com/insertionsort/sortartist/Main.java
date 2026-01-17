package com.insertionsort.sortartist;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArtistSort artistSort = new ArtistSort(); 
		
		
		System.out.println("\n--------------------- Artist Sort by their registration time (Insertion sort) ---------------------\n");
		int choice;
		while(true) {
			
			while(true) {	
//				System.out.println("\nEnter 1 to view all artists details");
//				System.out.println("Enter 2 to add an artist");
//				System.out.println("Enter 3 to sort artist list");
//				System.out.println("Enter 4 to exit");
//				
//				if(sc.hasNextInt()) {
//					choice = sc.nextInt();
//					break;
//				} else {
//					System.out.println("Enter a positive number: ");
//					sc.next();
//				}
//				
				try {
					System.out.println("\nEnter 1 to view all artists details");
					System.out.println("Enter 2 to add an artist");
					System.out.println("Enter 3 to sort artist list");
					System.out.println("Enter 4 to exit");
					
					choice = sc.nextInt();
					break;
				} catch(Exception e) {
					System.out.println("Please enter a valid choice");
					sc.next();
				}
			}
			
			
			LocalTime registrationTime;
			switch(choice) {
				case 1: 
					artistSort.showArtistDetails();
					break;
					
				case 2:
					System.out.println("Enter artist name: ");
					String artistName = sc.nextLine();
					sc.nextLine();
					
					while(true) {
						try {
							System.out.println("Enter registration time: ");
							String time = sc.nextLine();
							registrationTime = LocalTime.parse(time);
							break;
						} catch(Exception e) {
							System.out.println("Please enter a valid time: ");
							continue;
						}
					}
					
					artistSort.addArtist(new Artist(artistName, registrationTime));
					break;
					
				case 3:
					artistSort.sortArtists();
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