package com.foodorderingsystem;

public interface IOrderable {
	void placeOrder(int orderId);
	void cancelOrder(int foodId);
}