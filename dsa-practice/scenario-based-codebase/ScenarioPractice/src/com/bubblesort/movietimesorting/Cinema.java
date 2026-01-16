package com.bubblesort.movietimesorting;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	List<Movie> movies = new ArrayList<>();
	
	
	// Add a movie
	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println("Movie added");
	}
	
	
	// Sort movies - Bubble Sort
	public void sortMovies() {
		int n = movies.size();
		
		// Sort movies in ascending order
		for(int i=0; i<n-1; i++) {
			boolean isSwap = false;
			for(int j=0; j<n-1-i; j++) {
				if(movies.get(j).getStartingTime().isAfter(movies.get(j+1).getStartingTime())) {
					// Swap
					Movie movie = movies.get(j);
					movies.set(j, movies.get(j+1));
					movies.set(j+1, movie);
					isSwap = true;
				}
			}
			if(!isSwap) break;
		}
		System.out.println("Movie have been sorted by starting time");
	}
	
	
	// Show movie details
	public void showMovieDetails() {
		if(movies.isEmpty()) {
			System.out.println("No movie present");
			return; 
		}
		
		System.out.println("All movie details are: ");
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}
}