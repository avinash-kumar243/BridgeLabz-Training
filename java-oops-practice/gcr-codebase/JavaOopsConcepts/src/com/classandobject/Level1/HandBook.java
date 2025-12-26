package com.classandobject.Level1;

public class HandBook {
	private String title;
	private String author;
	private double price;
	
	// A constructor to assign data
	public HandBook(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// A method to display book details
	public void displayBookDetails() {
		System.out.println("Book title is : " + title);
		System.out.println("Book author is : " + author);
		System.out.println("Book price is : " + price);
	}
}