package com.insertionsort.movietime;

import java.time.LocalTime;

public class Movie {
	private String movieId;
	private LocalTime movieTime;
	
	public Movie(String movieId, LocalTime movieTime) {
		this.movieId = movieId;
		this.movieTime = movieTime;
	}

	
	// Getters for movie details
	public String getMovieId() {
		return movieId;
	}
	public LocalTime getMovieTime() {
		return movieTime;
	}
}