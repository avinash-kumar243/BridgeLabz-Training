package com.encapsulation.fooddeliverysystem;

public class FoodAppMain {
    public static void main(String[] args) {
    	FoodItem f1 = new VegItem("Paneer Tikka", 180, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 250, 1);

        OrderProcessor.processOrder(f1);
        OrderProcessor.processOrder(f2);

        Discountable d1 = (Discountable) f1;
        d1.applyDiscount(10);
        d1.getDiscountDetails();

        Discountable d2 = (Discountable) f2;
        d2.applyDiscount(5);
        d2.getDiscountDetails();
    }
}