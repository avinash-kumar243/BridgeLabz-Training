package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class SearchMovie {
	public static boolean search(String director, Movie head) {
		if(head == null) return false;
		
		Movie movie = head;
		while(movie != null && !movie.director.equals(director)) {
			movie = movie.next;
		}
		
		if(movie == null) return false;
		else {
			System.out.println("\nMovie name is: " + movie.title);
			System.out.println("Movie director is: " + movie.director);
			System.out.println("Movie release year is: " + movie.year);
			System.out.println("Movie rating is: " + movie.rating + "\n");
			return true;
		}
	}
}