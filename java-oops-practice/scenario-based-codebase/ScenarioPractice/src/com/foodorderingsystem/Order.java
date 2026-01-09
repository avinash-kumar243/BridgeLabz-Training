package com.foodorderingsystem;

import java.util.ArrayList;
import java.util.List;

// User can place and remove an order, also can see valet amount as well as total bill
public class Order implements IOrderable {
	protected static List<FoodItem> foodOrderList = new ArrayList<>();
	private double bill;
	
	User user;
	
	// Aggregation
	public Order(User user) {
		this.user = user;
	}
	
	public double totalBill() {
		double bill = 0;
		for(FoodItem item : foodOrderList) {
			bill += item.getPrice();
		}
		return bill;
	}
	
	@Override
	public void placeOrder(int foodId) {
		for(FoodItem item : ShopOwner.foodItems) {
			if(item.getId() == foodId) {
				double valletAmount = user.getValletAmount();
				double itemPrice = item.getPrice();
				if(valletAmount >= itemPrice) {
					foodOrderList.add(item);
					item.setAvailable(false);
					
					user.setValletAmount(valletAmount - itemPrice);
					System.out.println("Item placed\n");
				} else {
					System.out.println("Insufficient balance!!!");
				}
			}
		}
	}
	@Override
	public void cancelOrder(int foodId) {
		for(FoodItem item : ShopOwner.foodItems) {
			if(item.getId() == foodId) {
				foodOrderList.remove(item);
				double userValletAmount = user.getValletAmount();
				double itemPrice = item.getPrice();
				
				user.setValletAmount(userValletAmount + itemPrice);
				System.out.println("Item removed\n");
			}
		}
	}
}