package com.insertionsort.tailorshop;

import java.time.LocalTime;

public class Order {
	private String orderId;
	private LocalTime deliveryDeadline;
	
	public Order(String orderId, LocalTime deliveryDeadline) {
		this.orderId = orderId;
		this.deliveryDeadline = deliveryDeadline;
	}

	
	// Getters for Order details
	public String getOrderId() {
		return orderId;
	}
	public LocalTime getDeliveryDeadline() {
		return deliveryDeadline;
	}
	
	
	@Override
	public String toString() {
		return "Order id: " + orderId + ", delivery deadline: " + deliveryDeadline; 
	}
}