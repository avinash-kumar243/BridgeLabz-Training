package com.classandobject.Level2;

public class DisplayCartItem {
	public static void main(String[] args) {
		CartItem item1 = new CartItem("Laptop", 999.99, 1);
	    item1.displayItem();  // Display the initial item details
	    
	    // Adding and removing items
	    item1.addItem(2); 
	    item1.removeItem(1);
	    
	    // Displaying total cost
	    System.out.println("Total cost: $" + item1.totalCost());
	}
}