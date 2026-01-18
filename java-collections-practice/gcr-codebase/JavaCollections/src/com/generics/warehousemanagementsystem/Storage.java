package com.generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();
	
	
	// Add item
	public void addItem(T item) {
		items.add(item);
	}
	
	// Get items
	public List<T> getItems() {
		return items;  
	}
}