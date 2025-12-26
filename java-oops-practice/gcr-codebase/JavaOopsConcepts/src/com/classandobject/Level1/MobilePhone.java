package com.classandobject.Level1;

public class MobilePhone {
	private String brand;
	private String model;
	private double price;
	
	public MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayMobile() {
		System.out.println("Brand of mobile : " + brand);
		System.out.println("Model of mobile : " + model);
		System.out.println("Price of mobile : " + price);
		System.out.println("------------------------------");
	}
}