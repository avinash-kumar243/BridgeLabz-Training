package com.collectors.orderrevenuesummary;

public class Order {
	private String customer;
	private double amount;
	
	public Order(String customer, double amount) {
		super();
		this.customer = customer;
		this.amount = amount;
	}

	public String getCustomer() {
		return customer;
	}
	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", amount=" + amount + "]";
	}
}