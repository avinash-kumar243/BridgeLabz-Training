package com.classandobject.Level1;

public class Item {
	private String[] itemCode;
	private String[] itemName;
	private double[] price;
	
	public Item(String[] itemCode, String[] itemName, double[] price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayItem(int idx) {
		System.out.println("Item code is : " + itemCode[idx]);
		System.out.println("Item name is : " + itemName[idx]);
		System.out.println("Item price is : " + price[idx]);
		System.out.println("........................................");
	}
}