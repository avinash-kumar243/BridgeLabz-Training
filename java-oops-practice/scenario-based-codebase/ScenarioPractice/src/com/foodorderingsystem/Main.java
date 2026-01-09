package com.foodorderingsystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n--------------Welcome to our Restaurant---------------\n");

		
		// Creating food items
		FoodItem food1 = new VegItem("Chole Bature", "Veg Food", 100, 101, true);
		FoodItem food2 = new VegItem("Kheer", "Veg Food", 40, 102, true);
		FoodItem food3 = new VegItem("Matar Panner and Puri", "Veg Food", 120, 103, true);
		
		FoodItem food4 = new NonVegItem("Biryani", "Non-Veg", 200, 201, true);
		FoodItem food5 = new NonVegItem("Chiken Tikka", "Non-Veg", 400, 202, true);
		FoodItem food6 = new NonVegItem("Mutton Curry", "Non-Veg", 60, 203, true);
		
		// Creating owner and adding items into cart
		ShopOwner owner = new ShopOwner("Mohan");
		owner.addFood(food1);
		owner.addFood(food2);
		owner.addFood(food3);
		owner.addFood(food4);
		owner.addFood(food5);
		owner.addFood(food6);
				
		// Creating a user 
		User user = new User("Allu", 1000);
		
		Order order = new Order(user);
		
		// Actual work
		while(true) {
			
			System.out.println("\n--------------Food Items---------------");
			System.out.println("Enter 1 to view all available items in the restaurant: ");
			System.out.println("Enter 2 to place an item: ");
			System.out.println("Enter 3 to delete an item: ");
			System.out.println("Enter 4 to view vallet amount: ");
			System.out.println("Enter 5 to view total bill: ");
			System.out.println("Enter 6 to exit Restaurant: ");
			
			int choice = sc.nextInt();
			
			if(choice == 6) {
				System.out.println("\nThank you. Please come again at our restaurant");
				break;
			}
			
			switch(choice) {
				case 1:
					System.out.println("\nAvailable Food Items are: \n");
					owner.viewFoodItems();
					break;
				
				case 2:
					System.out.println("\nPlease enter order id: ");
					int orderId = sc.nextInt();
					order.placeOrder(orderId);
					break;
				
				case 3:
					System.out.println("\nEnter order id: ");
					int orderId2 = sc.nextInt();
					order.cancelOrder(orderId2);
					break; 
					
				case 4: 
					double balance = user.getValletAmount();
					System.out.println("Remainig vallet amount: " + balance);
					break;
					
				case 5: 
					double bill = order.totalBill();
					System.out.println("Total bill: " + bill);
					break;
				
				default:
					System.out.println("Invalid choice!!!");					
			}
			
		}
		
	}
}