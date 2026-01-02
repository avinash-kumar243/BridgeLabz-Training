package com.inheritance.multilevelinheritance.retailordermanagement;

import java.time.LocalDate;
public class DeliveredOrder extends ShippedOrder {
	protected LocalDate deliveryDate;
	
	public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	
	@Override
	public String getOrderStatus() {
		return "Order Delivered";
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Delivery Date: " + deliveryDate);
	}
}