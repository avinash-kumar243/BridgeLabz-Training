package com.objectmodeling.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private String name;
	private List<Book> books; // Aggregation
	
	public Library(String name) {
		this.name = name;
		this.books = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void showBooks() {
		System.out.println("\nBooks are at " + name);
		for(Book b : books) {
			System.out.println(" - " + b);
		}
	}
}