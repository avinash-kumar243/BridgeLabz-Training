package com.objectmodeling.librarymanagement;

public class Main {
	public static void main(String[] args) {
		// Creating library objects
		Library l1 = new Library("central library");
		Library l2 = new Library("city library");
		
		// Creating book objects
		Book b1 = new Book("Java", "James Gosling");
		Book b2 = new Book("C", "Dennis Ritchie");
		Book b3 = new Book("C++", "Bjarne Stroustrup");
		
		// Add books to central library
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		
		// Add books to city library
		l2.addBook(b2);
		l2.addBook(b3);
		
		// Display library book details
		l1.showBooks();
		l2.showBooks();
	}
}