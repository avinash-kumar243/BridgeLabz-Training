package com.multithreading.problems.restaurantorderprocessingsystem;

public class Kitchen {
	public static void main(String[] args) throws InterruptedException {
		Thread chef1 = new Thread(new Chef("Chef 1", "Pizza", 12));
		Thread chef2 = new Thread(new Chef("Chef 2", "Pasta", 8));
		Thread chef3 = new Thread(new Chef("Chef 3", "Salad", 4));
		Thread chef4 = new Thread(new Chef("Chef 4", "Burger", 4));

		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();
		
		
		// Manager wait for all chefs
		chef1.join();
		chef2.join();
		chef3.join();
		chef4.join();
		
		System.out.println("Kitchen closed - All orders completed");
	}
}