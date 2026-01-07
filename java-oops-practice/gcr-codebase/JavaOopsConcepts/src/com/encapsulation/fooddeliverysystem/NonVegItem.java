package com.encapsulation.fooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge = 30;
    private double discountApplied = 0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + extraCharge;
        System.out.println("Non-Veg Item total price : " + total);
        return total;
    }

    @Override
    public void applyDiscount(double discountPercent) {
        discountApplied = (getPrice() * getQuantity()) * (discountPercent / 100);
        System.out.println("Discount applied on Non-Veg Item : " + discountApplied);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount amount : " + discountApplied);
    }
}