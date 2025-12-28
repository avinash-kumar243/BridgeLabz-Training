package com.constructor.Level1;

public class DisplayBooks {
	private String title;
	private String author;
	private double price;
	private boolean availability;
	
	// Parameterized Constructor
	public DisplayBooks(String title, String author, double price, boolean availability) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	// Method to borrow a book
	void borrowBook() {
		if(availability) {
			availability = false;
			System.out.println(title + " - Book borrowed");
		} else {
			System.out.println(title + " - Book is not available");
		}
	}
	
	// Show Book Details
	public void showBook() {
		System.out.println("Book title is : " + title);
		System.out.println("Book author is : " + author);
		System.out.println("Book price is : " + price);
		System.out.println("Book is Available : " + availability + "\n");
	}
}