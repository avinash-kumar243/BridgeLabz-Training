package com.insertionsort.bookmanagement;

public class Book {
	private String isbn;
	private String title;

	// Constructors to initialize ISBN number
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	@Override
	public String toString() {
		return "Book title: " + this.title + ", book isbn number: " + this.isbn;
	}
}