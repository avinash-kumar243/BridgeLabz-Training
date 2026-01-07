package com.encapsulation.fooddeliverysystem;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    private boolean isOrderLocked = false;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void updateQuantity(int quantity) {
        if (!isOrderLocked) {
            this.quantity = quantity;
        } else {
            System.out.println("Order is locked. Quantity cannot be modified.");
        }
    }
    public void lockOrder() {
        isOrderLocked = true;
    }

    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    
    public abstract double calculateTotalPrice();
}