package com.streamapi.trendingmovies;

public class Movie {
	private String name;
	private double rating;
	private int year;
	
	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	// Getters for movie details
	public String getName() {
		return name;
	}
	public double getRating() {
		return rating;
	}
	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie Name: " + name + " || rating: " + rating + " || Year: " + year;
	}
}