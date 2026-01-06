package com.groceryshoppingapp;

public interface ICheckout {
	double applyDiscount(double amount);
	String generateBill();
}