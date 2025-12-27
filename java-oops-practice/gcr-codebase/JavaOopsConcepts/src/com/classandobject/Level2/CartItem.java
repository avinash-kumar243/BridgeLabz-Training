package com.classandobject.Level2;

public class CartItem {
	   private String itemName;
	   private double price;
	   private int quantity;
	   
	   // Constructor for initializing the attributes
	   public CartItem(String itemName, double price, int quantity) {
	       this.itemName = itemName;
	       this.price = price;
	       this.quantity = quantity;
	   }
	   
	   // Adding items to the cart
	   public void addItem(int quantityToAdd) {
	       this.quantity += quantityToAdd;
	       System.out.println("Added " + quantityToAdd + " of " + this.itemName + " to the Cart");
	   }
	   
	   // removing items from the Cart
	   public void removeItem(int quantityToRemove) {
	       if (quantityToRemove > this.quantity) {
	           System.out.println("Cannot remove " + quantityToRemove + " of " + this.itemName + " as there are only " + this.quantity + " left.");
	       } else {
	           this.quantity -= quantityToRemove;
	           System.out.println("Removed " + quantityToRemove + " of " + this.itemName + " from the cart.");
	       }
	   }
	   
	   // Method to calculate the total cost of the items in the cart
	   public double totalCost() {
	       return this.price * this.quantity;
	   }
	   
	   // Method to display the item details
	   public void displayItem() {
	       System.out.println("Item: " + this.itemName + ", Price: $" + this.price + ", Quantity: " + this.quantity);
	   }
}
