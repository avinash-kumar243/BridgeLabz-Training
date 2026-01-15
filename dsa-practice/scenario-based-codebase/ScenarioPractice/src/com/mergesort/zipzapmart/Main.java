package com.mergesort.zipzapmart;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SortTransaction sortTransactions = new SortTransaction();
		
		
		System.out.println("\n-----------------------Zip Zap Mart (Daily sales summary report)-----------------------\n");
		while(true) {
			System.out.println("\nEnter 1 to view all sorted transactions");
			System.out.println("Enter 2 to add a transaction");
			System.out.println("Enter 3 to sort transactions");
			System.out.println("Enter 4 to exit");

			int choice = sc.nextInt();
						
			switch(choice) {
				case 1: 
					sortTransactions.showAllTransactions();
					break;
					
				case 2: 
					System.out.print("Enter transaction id: ");
					String id = sc.next();
					
					System.out.print("Enter transaction date: ");
					String time = sc.next();
					LocalDate date = LocalDate.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
					
					System.out.print("Enter transaction amount: ");
					double amount = sc.nextDouble();
					
					while(amount < 0) {
						System.out.println("----------Invalid critical lavel. Please enter between 1 and 10----------");
						amount = sc.nextDouble();
					}
										
					sortTransactions.addTransaction(new Transaction(id, date, amount));
					break;
					
				case 3:
					sortTransactions.sortTransactions();
					
					break;
					
				case 4:
					System.out.println("Use me again!");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}