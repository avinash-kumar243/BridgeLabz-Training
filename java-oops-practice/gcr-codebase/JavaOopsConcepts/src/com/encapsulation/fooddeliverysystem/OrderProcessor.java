package com.encapsulation.fooddeliverysystem;

public class OrderProcessor {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        item.calculateTotalPrice();
        item.lockOrder();
        System.out.println("---------------------------------");
    }
}