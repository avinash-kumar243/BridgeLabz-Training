package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class DisplayMovies {
	public static void display(Movie head) {
		System.out.println("\n------------- Movies are ------------\n");
		
		Movie temp = head;
		while(temp != null) {
			System.out.println("Movie name is: " + temp.title);
			System.out.println("Movie director is: " + temp.director);
			System.out.println("Movie release year is: " + temp.year);
			System.out.println("Movie rating is: " + temp.rating);
			
			temp = temp.next;
		}
	}
}