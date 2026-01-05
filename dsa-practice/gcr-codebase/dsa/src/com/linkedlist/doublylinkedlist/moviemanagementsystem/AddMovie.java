package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class AddMovie {
	
	// Add movie at first
	public static Movie addMovieAtFirst(Movie movie, Movie head) { 
		if(head == null) return movie;
		
		movie.next = head;
		head.prev = movie; 
		return movie;
	}
	
	// Add movie at Last
	public static Movie addMovieAtLast(Movie movie, Movie head) { 
		if(head == null) return movie;
		
		Movie temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = movie;
		movie.prev = temp;
		return head;
	}
	
	// Add movie at Middle index
	public static Movie addMovieAtMiddle(Movie movie, Movie head, int pos) { 
		if(head == null) return movie;
		if(pos == 1) return addMovieAtFirst(movie, head);
		
		int idx = 1;
		Movie temp = head;
		while(temp.next != null && idx < pos-1) {
			temp = temp.next;
			idx++;
		}
		
		movie.next = temp.next;
		temp.next = movie;
		movie.prev = temp;
		movie.next.prev = movie;

		return head;
	}
}