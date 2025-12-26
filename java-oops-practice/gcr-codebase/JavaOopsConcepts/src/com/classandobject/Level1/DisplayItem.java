package com.classandobject.Level1;

public class DisplayItem {
	public static void main(String[] args) {
		String itemCode[] = {"01AA", "01BB", "02AA"};
		String itemName[] = {"Water bottle", "Rice", "blackboard"};
		double price[] = {500, 700, 400};
		
		Item item = new Item(itemName, itemCode, price);
		
		for(int i=0; i<price.length; i++) {
			item.displayItem(i);
		}
	}
}