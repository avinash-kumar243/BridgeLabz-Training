package com.groceryshoppingapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cart implements ICheckout {
	private List<CartItem> items = new ArrayList<>();
	private double totalPrice;
	
	public Cart() {
		
	}
	public Cart(List<CartItem> items) {
		this.items.addAll(items);
		recalculateTotal();
	}
	
	private void recalculateTotal() {
		totalPrice = 0;
		for(CartItem item : items) {
			totalPrice += item.getLineTotal();
		}
	}
	public void addProduct(Product product, int quantity) {
		items.add(new CartItem(product, quantity));
		recalculateTotal();
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	
	@Override
	public double applyDiscount(double amount) {
		double discount = 0;
		
		for(CartItem item : items) {
			Product p = item.getProduct();
			discount += item.getLineTotal() * p.getDiscountRate();
		}
		
		totalPrice = (totalPrice - discount) - amount;
		
		if(totalPrice < 0) totalPrice = 0;
		
		return totalPrice;
	}
	@Override
	public String generateBill() {
		StringBuilder bill = new StringBuilder();
		
		for(CartItem item : items) {
			bill.append(item.getProduct().getName()).append("  x ").append(item.getQuantity()).append("  = ").append(item.getLineTotal()).append("\n");
		}
		
		bill.append("---------------------------------\n");
		bill.append("Final amount to pay: ").append(totalPrice).append("\n");
		
		return bill.toString();
	}
}