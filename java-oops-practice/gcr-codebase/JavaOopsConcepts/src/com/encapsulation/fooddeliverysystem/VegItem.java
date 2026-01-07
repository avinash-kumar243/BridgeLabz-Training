package com.encapsulation.fooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    private double discountApplied = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        System.out.println("Veg Item Total Price : " + total);
        return total;
    }

    @Override
    public void applyDiscount(double discountPercent) {
        discountApplied = (getPrice() * getQuantity()) * (discountPercent / 100);
        System.out.println("Discount applied on Veg Item : " + discountApplied);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Veg Item Discount Amount : " + discountApplied);
    }
}