package com.foodorderingsystem;

public class FoodItem {
	private String name;
	private String catagory;
	private double price;
	private int id;
	private boolean available;
	private int foodStock;
	
	public FoodItem(String name, String catagory, double price, int id, boolean available) {
		this.name = name;
		this.catagory = catagory;
		this.price = price;
		this.id = id;
		this.available = available;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getFoodStock() {
		return foodStock;
	}
	public void setFoodStock(int foodStock) {
		this.foodStock = foodStock;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
}