package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {
	private String speciality;
	
	public Chef(String name, int id, String speciality) {
		super(name, id);
		this.speciality = speciality;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
	}
	
	@Override
	public void performDuties() {
		System.out.println("Chef prepares meals and manages kitchen operations.");
		System.out.println("Speciality: " + speciality);
	}
}