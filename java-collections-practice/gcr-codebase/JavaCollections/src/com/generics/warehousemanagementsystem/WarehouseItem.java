package com.generics.warehousemanagementsystem;

abstract class WarehouseItem {
	private String itemName;
	private double itemPrice;
		
	public WarehouseItem(String itemName, double itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}


	// Getter for item name and item price
	public String getItemName() {
		return itemName;
	}
	public double getItemPrice() {
		return itemPrice; 
	}
	

	// Display item details
	void displayItemDetails() {
		System.out.println("Item name: " + itemName + " || price: " + itemPrice);
	}
}