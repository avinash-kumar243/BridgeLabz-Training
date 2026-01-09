package com.foodorderingsystem;

import java.util.ArrayList;
import java.util.List;

public class ShopOwner {
	private String name;
	static List<FoodItem> foodItems = new ArrayList<>();
	
	public ShopOwner(String name) {
		this.name = name;
	}
	
	// Shop owner can add and remove food
	protected void addFood(FoodItem newFood) {;
		// System.out.println(newFood.getName() + " - added");
		foodItems.add(newFood);
	}
	
	protected void removeFood(FoodItem food) {
		// System.out.println("Food removed");
		foodItems.remove(food);
	}
	
	protected void updateFoodAvailibility(int id, boolean availability) {
		for(FoodItem item:foodItems) {
			if(item.getId()==id) {
				System.out.println("Food availability updated");
				item.setAvailable(availability);
				return;
			}
		}
		System.out.println("Food not found");
	}
	
	protected void viewFoodItems() {
		for(FoodItem food : foodItems) {
			System.out.println("Food id: " + food.getId());
			System.out.println("Food name: " + food.getName());
			System.out.println("Food catagory: " + food.getCatagory());
			System.out.println("Food price: " + food.getPrice() + "\n");
		}
	}
}