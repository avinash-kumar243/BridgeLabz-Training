package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
	public static void main(String[] args) {
		Movie head = new Movie("Sholay", "Ramesh Sippy", 1975, 4.1);
		
		System.out.println("\n-------------- Adding movies --------------\n");
		head = AddMovie.addMovieAtFirst(new Movie("3 Idiots", "Rajkumar Hirani", 2009, 4.2), head);
		head = AddMovie.addMovieAtMiddle(new Movie("PK", "Rajkumar Hirani", 2014, 3.6), head, 2);
		head = AddMovie.addMovieAtLast(new Movie("B", "Vikas Bahl", 2014, 4.2), head);
		
		DisplayMovies.display(head);
		
		
		System.out.println("\n-------------- Deleting movies ---------------\n");
		head = DeleteMovie.delete(head.next.title, head);
		
		
		System.out.println("\n-------------- Updating movies ---------------\n");
		head = UpdateMovie.update(head.next.title, "updated title", head);
		System.out.println("\n --------------- Updated movies are --------------\n");
		DisplayMovies.display(head);
		
		boolean isFound = SearchMovie.search(head.next.director, head);
		if(isFound) System.out.println("Movie found");
		else System.out.println("Movie not found");
	}
}