package com.LibraryOrganizer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Library {
	private String name;
	private Map<String, LinkedList<Book>> bookList;
	
	public Library(String name) {
		this.name = name;
		this.bookList = new HashMap<>();
		printLibraryName();
	}

	
	// Main work (Logic) 
	// add Book
	public void addBook(String genre, Book book) {
		
		genre = genre.toLowerCase();
		
		if(!bookList.containsKey(genre)) {
			bookList.put(genre, new LinkedList<>());
		}

		// Adding book to genre
		LinkedList<Book> temp = bookList.get(genre);
		temp.add(book);
		bookList.put(genre, temp); 
		
		System.out.println("\nBook added successfully");
	}
	
	// borrow Book :- make book availability false
	public void borrowBook(String genre, String isbn) {
		genre = genre.toLowerCase();
		if(!bookList.containsKey(genre)) {
			System.out.println("Genry does not exist!");
			return;
		}
		 
		LinkedList<Book> books = bookList.get(genre);
		for(Book book : books) {
			if(book.getIsbn().equalsIgnoreCase(isbn) && !book.getAvailability()) {
				System.out.println("Book is not available currently");
				return;
			} else if(book.getIsbn().equalsIgnoreCase(isbn) && book.getAvailability()) {
				book.setAvailability(false);  // If book borrowed then their availability become false
				System.out.println("Book borrowed");  
				return;
			}
		}
		System.out.println("Invalid isbn. Book not found");
	}
	
	
	// return Book :- make book availability true
	public void returnBook(String genre, String isbn) {
		genre = genre.toLowerCase();
		if(!bookList.containsKey(genre)) {
			System.out.println("Invalid Genre!");
			return;
		}
		
		LinkedList<Book> books = bookList.get(genre);
		for(Book book : books) {
			if(book.getIsbn().equalsIgnoreCase(isbn) && book.getAvailability()) {
				System.out.println("Book already exist");
				return;
			} else if(book.getIsbn().equalsIgnoreCase(isbn) && !book.getAvailability()) {
				book.setAvailability(true);  // If book return then their availability become true
				System.out.println("Book returned successfully");
			}
		}
	}
	
	
	// View all available and unavailable books
	public void viewAllBooks() {
		System.out.println("\nAll available books are :- \n");
		
		for(Map.Entry<String, LinkedList<Book>> emt : bookList.entrySet()) {
			String genre = emt.getKey();
			LinkedList<Book> books = emt.getValue();
			
			System.out.println("\n--------Genre: " + genre + "---------");
			int count = 1;
			for(Book book : books) {
				System.out.println("Book " + count + " :- ");
				System.out.println("Book isbn id: " + book.getIsbn());
				System.out.println("Book title: " + book.getTitle());
				System.out.println("Book author: " + book.getAuthor());
				System.out.println("Book price: " + book.getPrice());
				System.out.println("Book availability: " + book.getAvailability() + "\n");
				count++;
			}
		}
	}
	
	private void printLibraryName() {
		System.out.println("\n------------------------Welcome to " + name + "-----------------------\n");
	}
}