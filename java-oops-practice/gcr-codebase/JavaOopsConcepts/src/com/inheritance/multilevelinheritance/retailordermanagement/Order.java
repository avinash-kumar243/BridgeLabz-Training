package com.inheritance.multilevelinheritance.retailordermanagement;

import java.time.LocalDate;

public class Order {
	protected String orderId;
	protected LocalDate orderDate;
	
	public Order(String orderId, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	public String getOrderStatus() {
		 return "Order Placed";
	}
	
	public void showDetails() {
		System.out.println("Order id: " + orderId + " || orderDate: " + orderDate + " || order status: " + getOrderStatus());
	}
}