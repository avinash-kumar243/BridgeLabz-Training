package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class Movie {
	protected String title;
	protected String director;
	protected int year;
	protected double rating;
	Movie next, prev;
	
	public Movie(String title, String director, int year, double rating) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.rating = rating;
		this.next = this.prev = null;
	}
}