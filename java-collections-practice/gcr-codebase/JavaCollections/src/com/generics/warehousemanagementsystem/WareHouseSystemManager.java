package com.generics.warehousemanagementsystem;

import java.util.List;

public class WareHouseSystemManager {

	public static void displayItems(List<? extends WarehouseItem> items) {
		for(WarehouseItem item : items) {
			System.out.println("Name: " + item.getItemName() + ", price: " + item.getItemPrice());
		}
	}
} 