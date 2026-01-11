package com.LibraryOrganizer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Library l1 = new Library("Central Library");
		
		String title, isbn, author, genre;
		double price;
		
		while(true) {
			System.out.println("\n---------------------------------------------------");
			System.out.println("Enter 1 to view all books");
			System.out.println("Enter 2 to add book");
			System.out.println("Enter 3 to borrow book");
			System.out.println("Enter 4 to return book");
			System.out.println("Enter 5 to exit");
			
			if(!sc.hasNextInt()) {
				System.out.println("Invalid input. Please enter a valid number from 1 to 5");
				sc.nextLine();
				continue;
			}
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice == 5) {
				System.out.println("\nThanku. Please come again\n");
				break;
			}
			
			switch(choice) {
				case 1:
					l1.viewAllBooks();
					break;
					
				case 2:
					System.out.println("\nPlease Enter Book details: ");
					System.out.println("Title: ");
					title = sc.nextLine();
					System.out.println("ISBN no: ");
					isbn = sc.nextLine();
					System.out.println("Author: ");
					author = sc.nextLine();
					System.out.println("Price: ");
					price = sc.nextDouble();
					sc.nextLine();
					
					System.out.println("Enter Genre: ");
					genre = sc.nextLine();
					
					l1.addBook(genre, new Book(isbn, title, price, author));
					break;
					
				case 3:
					System.out.println("Please enter Genre: ");
					genre = sc.nextLine();
					System.out.println("Please enter isbn no: ");
					isbn = sc.nextLine();
					
					l1.borrowBook(genre, isbn);
					break;
					
				case 4: 
					System.out.println("Please enter Genre: ");
					genre = sc.nextLine();
					System.out.println("Please enter isbn no: ");
					isbn = sc.nextLine();
					
					l1.returnBook(genre, isbn);
					break;
					
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}