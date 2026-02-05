package com.multithreading.problems.bankingsystem;

import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		BankAccount customer2 = new BankAccount();
		BankAccount customer3 = new BankAccount();
		BankAccount customer4 = new BankAccount();
		BankAccount customer5 = new BankAccount();
		
		
		Thread withdrawal1 = new Thread(new Transaction(customer1, 3000, LocalTime.now().minusHours(2), true));
		Thread withdrawal2 = new Thread(new Transaction(customer2, 4000, LocalTime.now(), true));
		Thread withdrawal3 = new Thread(new Transaction(customer3, 2000, LocalTime.now().minusHours(3), true));
		Thread withdrawal4 = new Thread(new Transaction(customer4, 5000, LocalTime.now(), true));
		Thread withdrawal5 = new Thread(new Transaction(customer5, 1500, LocalTime.now().minusHours(6), true));

		withdrawal1.setName("Avi");
		withdrawal2.setName("Mohan");
		withdrawal3.setName("Komal");
		withdrawal4.setName("Deepak");
		withdrawal5.setName("Shivam");

		
		// Current state of all customers before processing
		withdrawal1.getState();
		withdrawal2.getState();
		withdrawal3.getState();
		withdrawal4.getState();
		withdrawal5.getState();
		
		// Multiple customers can withdraw money from their accounts simultaneously,
		withdrawal1.start();
		withdrawal2.start();
		withdrawal3.start();
		withdrawal4.start();
		withdrawal5.start();
		
		
	}
}