package com.constructor.Level1;

public class BookLibrary {
	public long isbn;
	protected String title;
	private String author;

	public BookLibrary(long isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}

	// Getter and Setter for author name
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String authorName) {
		if(authorName != null) this.author = authorName;
		else System.out.println("Invalid Name!");
	}
	
	// Details about Book and author
	public void showBookDetails() {
		System.out.println("\nBook ISBN number is : " + isbn);
		System.out.println("Book Title is : " + title);
		System.out.println("Book Author name is : " + author);
	}
}