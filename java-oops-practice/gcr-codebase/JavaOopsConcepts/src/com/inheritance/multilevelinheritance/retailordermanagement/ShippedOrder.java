package com.inheritance.multilevelinheritance.retailordermanagement;

import java.time.LocalDate;
public class ShippedOrder extends Order {
	protected String trackingNumber;
	
	public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	@Override
	public String getOrderStatus() {
		return "Order Shipped";
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Tracking Number: " + trackingNumber);
	}
}