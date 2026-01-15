package com.insertionsort.bookmanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> bookList = new ArrayList<>();

	// Add Book
	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully");
	}

	// Remove Book
	public void removeBook(String isbn) {
		for(Book book : bookList) {
			if(book.getIsbn().equalsIgnoreCase(book.getIsbn())) {
				bookList.remove(book);
				System.out.println("Book removed");
				return;
			} 
		}
		System.out.println("Book not found");
	}

	// Sort all books - Insertion Sort
	public void sortBooks() {
		if(bookList.isEmpty()) {
			System.out.println("\nBook list is empty");
			return;
		}
		
		int n = bookList.size();
		for(int i=1; i<n; i++) {
			Book book = bookList.get(i);
			int j = i-1;
			
			while(j >= 0 && bookList.get(j).getTitle().compareToIgnoreCase(book.getTitle()) > 0) {
				if(bookList.get(j).getTitle().compareToIgnoreCase(book.getTitle()) > 0) {
					// Swap of books
					bookList.set(j+1, bookList.get(j));
					j--;
				}
			}
			
			// Place 1st book at its correct position
			bookList.set(j+1, book);
		}
		System.out.println("Book sorted successfully");
	}
	
	// Show all Books
	public void showAllBooks() {
		if(bookList.isEmpty()) {
			System.out.println("\nBook list is empty");
			return;
		}
		
		System.out.println("\nBook details are: ");
		for(Book book : bookList) {
			System.out.print(book + "\n");
		}
	}
}
