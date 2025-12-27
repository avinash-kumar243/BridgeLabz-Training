package com.constructor.Level1;

public class DisplayBook {
	private String title;
	private String author;
	private double price;
	
	// Default Constructor
	public DisplayBook() {
		title = "The art of reading Minds";
		author = "David Lioyd Shepard";
		price = 1600;
	}
	
	// Parameterized Costructor
	public DisplayBook(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Display Book Details
	public void displayBook() {
		System.out.println("\nBook name is : " + this.title + "\nit's author is : " + author + "\nit's price is : " + price);
	}
}