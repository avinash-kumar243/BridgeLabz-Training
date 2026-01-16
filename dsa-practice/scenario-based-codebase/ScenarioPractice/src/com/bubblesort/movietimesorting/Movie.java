package com.bubblesort.movietimesorting;

import java.time.LocalTime;

public class Movie {
	private String movieName;
	private LocalTime startingTime;
	
	public Movie(String movieName, LocalTime startingTime) {
		this.movieName = movieName;
		this.startingTime = startingTime;
	}
	

	// Getters for Movie
	public String getMovieName() {
		return movieName;
	}
	public LocalTime getStartingTime() {
		return startingTime;
	}
	

	@Override
	public String toString() { 
		return "Movie name: " + movieName + " || Movie show starting time: " + startingTime;  
	}
}