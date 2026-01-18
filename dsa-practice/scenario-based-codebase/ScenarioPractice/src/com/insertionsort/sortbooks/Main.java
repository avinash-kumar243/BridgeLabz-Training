package com.insertionsort.sortbooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	// Sort Books - Insertion Sort
	private static void sortBooks(List<Books> books) {
		int n = books.size();
		for(int i=1; i<n; i++) {
			Books top = books.get(i);
			
			int j = i-1;
			while(j >= 0 && books.get(j).getTitle().compareToIgnoreCase(top.getTitle()) > 0) {
				books.set(j+1,books.get(j));
				j--;
			}
			
			j++;
			books.set(j, top);
		}
		System.out.println("Book Sorted\n");
	}
	
	// Add a Book
	private static void addBook(List<Books> books, Books book) {
		books.add(book);
		System.out.println("Book added");
	}
	
	// Display Books
	private static void displayBooks(List<Books> books) {
		System.out.println("------------- Book Details are: ---------------");
		
		int count = 1;
		for(Books book : books) {
			System.out.println("Book " + count + " title: " + book.getTitle());
			count++;
		}
	}
	
	// Main Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Books> books = new ArrayList<>(Arrays.asList(new Books("Abc"), new Books("poq"), new Books("Mno"), new Books("XYZ"), new Books("Aaa")));
			
		sortBooks(books);	
			
		while(true) {
			System.out.println("\nEnter 1 to show all books");
			System.out.println("Enter 2 to add a book");
			System.out.println("Enter 3 to sort books");
			System.out.println("Enter 4 to exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					displayBooks(books);
					break;
					
				case 2:
					System.out.println("Enter book title: ");
					String title = sc.nextLine();
					
					books.add(new Books(title));
					System.out.println("Book added");
					break;
					
				case 3:
					sortBooks(books);
					break;
					
				case 4:
					System.out.println("Thank you");
					return;
					
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}