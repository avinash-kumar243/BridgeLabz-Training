package com.generics.warehousemanagementsystem;

public class Main {
	public static void main(String[] args) {
		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();

		electronicsStorage.addItem(new Electronics("Laptop", 50000));
		electronicsStorage.addItem(new Electronics("Laptop", 45000));
		
		furnitureStorage.addItem(new Furniture("Chair", 2000));
		furnitureStorage.addItem(new Furniture("Table", 1000));

		groceriesStorage.addItem(new Groceries("Rice", 1200));
		groceriesStorage.addItem(new Groceries("Milk", 800));
		

		System.out.println("\n--------- Electronics --------\n");
		WareHouseSystemManager.displayItems(electronicsStorage.getItems());
		
		
		System.out.println("\n--------- Electronics --------\n");
		WareHouseSystemManager.displayItems(furnitureStorage.getItems());

				
		System.out.println("\n--------- Electronics --------\n");
		WareHouseSystemManager.displayItems(groceriesStorage.getItems());
	}
} 