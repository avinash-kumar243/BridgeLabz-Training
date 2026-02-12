package com.json.convert_javaobject_to_json;

public class Car {
	private String brand;
	private String color;
	private int price;
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
}