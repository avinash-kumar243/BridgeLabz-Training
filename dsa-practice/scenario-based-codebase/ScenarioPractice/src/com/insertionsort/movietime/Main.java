package com.insertionsort.movietime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	// Add movie
	public static void addMovie(ArrayList<Movie> movies, Movie movie) {
		movies.add(movie);
		System.out.println("Movie added");
	}
	
	
	// Method to sort movie timings - Insertion Sort
	private static void sortMovieTime(ArrayList<Movie> movies) {
		int n = movies.size();
		
		for(int i=1; i<n; i++) {
			int j;
			Movie top = movies.get(i);
			for(j=i-1; j>=0; j--) {
				if(movies.get(j).getMovieTime().isAfter(top.getMovieTime())) {
					movies.set(j+1, movies.get(j));
				} else {
					break;
				}
			}
			
			j++;
			movies.set(j, top);
		}
	}
	
		
	// Display all movies details
	public static void display(ArrayList<Movie> movies) {
		for(Movie movie : movies) {
			System.out.println("Movie id: " + movie.getMovieId() + ", show time: " + movie.getMovieTime());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------- Theater Show Listings (Insertion Sort) --------------");
		
		ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(new Movie("101", LocalTime.parse("15:30")), new Movie("102", LocalTime.parse("10:30")), new Movie("103", LocalTime.parse("22:00")), new Movie("104", LocalTime.parse("11:30")), new Movie("105", LocalTime.parse("18:00")), new Movie("106", LocalTime.parse("10:00"))));
		
		System.out.println("\n\nBefore sorting all movies details are: \n");
		display(movies);
		
		
		// Method to sort movie time
		sortMovieTime(movies);
		
		System.out.println("\n\nAfter sorting by shpow time, all movies details are: \n");
		display(movies);
		
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		
		// Loop for multiple movie addition and then sorting all movies
		int choice;
		while(true) {
			System.out.println("\nEnter 1 to add movie");
			System.out.println("Enter 2 to sort all movies");
			System.out.println("Enter 3 to view all movies details");
			System.out.println("Enter 4 to exit");

			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch(Exception e) {
				System.out.println("Invalid choice!!!");
				sc.nextLine();
				continue;
			}
			
			
			// Switch cases for multiple choices
			switch(choice) {
				case 1:
					System.out.println("Enter movie id: ");
					String id = sc.nextLine();
					
					System.out.println("Enter movie show time: ");
					LocalTime showTime = LocalTime.parse(sc.nextLine());
					
					addMovie(movies, new Movie(id, showTime));
					break;
					
				case 2:
					System.out.println("All movies sorted by their show time");
					sortMovieTime(movies);
					break;
					
				case 3:
					System.out.println("\nAll movies details are: ");
					display(movies);
					break;
					
				case 4:
					System.out.println("Thank you");
					return;
					
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}