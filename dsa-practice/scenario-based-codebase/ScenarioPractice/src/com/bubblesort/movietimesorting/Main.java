package com.bubblesort.movietimesorting;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cinema cinema = new Cinema();
		
		
		System.out.println("\n---------------------Movie Time Sorting (Bubble Sort)---------------------\n");
		int choice;
		while(true) {
			
			while(true) {	
				System.out.println("\nEnter 1 to view all movies details");
				System.out.println("Enter 2 to add a movie");
				System.out.println("Enter 3 to sort movies");
				System.out.println("Enter 4 to exit");
				
				if(sc.hasNextInt()) {
					choice = sc.nextInt();
					break;
				} else {
					System.out.println("Enter a positive number: ");
					sc.next();
				}
			}
			
			
			LocalTime movieStartTime;
			switch(choice) {
				case 1: 
					cinema.showMovieDetails();
					break;
					
				case 2:
					System.out.println("Enter Movie name: ");
					String movieName = sc.nextLine();
					sc.nextLine();
					
					while(true) {
						try {
							System.out.print("Enter Movie start time (HH:MM) : ");
							String movieTime = sc.nextLine(); 

							movieStartTime = LocalTime.parse(movieTime);
							break;
						} catch(Exception e) {
							System.out.println("Invalid time. Please enter a valid time\n");
						}
					}
					
					cinema.addMovie(new Movie(movieName, movieStartTime));
					break;
					
				case 3:
					cinema.sortMovies();
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