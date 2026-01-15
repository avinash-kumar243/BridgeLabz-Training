package com.insertionsort.bookmanagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Library library = new Library();
		
		
		System.out.println("\n---------------------Library Management -> Sort Book alphabetically in reading list---------------------\n");
		while(true) {
			System.out.println("\nEnter 1 to view all sorted books");
			System.out.println("Enter 2 to add book");
			System.out.println("Enter 3 to remove book");
			System.out.println("Enter 4 to sort books");
			System.out.println("Enter 5 to exit");

			int choice = sc.nextInt();

			String title, isbn;
			
			switch(choice) {
				case 1: 
					library.showAllBooks();
					break;
					
				case 2:
					sc.nextLine();
					System.out.print("Enter book title: ");
					title = sc.nextLine();
					System.out.print("Enter book id: ");
					isbn = sc.next();

					while(isbn == null) {
						System.out.println("----------Invalid isbn id. Please enter a valid isbn id----------");
						isbn = sc.next();
					}
										
					library.addBook(new Book(title, isbn));
					break;
					
				case 3:
					System.out.print("Enter book isbn: ");
					isbn = sc.next();
					
					while(isbn == null) {
						System.out.println("----------Invalid isbn id. Please enter a valid isbn id----------");
						isbn = sc.next();
					}
					
					library.removeBook(isbn);
					break;
					
				case 4:
					library.sortBooks();
					break;
					
				case 5:
					System.out.println("Thanku. Please come again");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}