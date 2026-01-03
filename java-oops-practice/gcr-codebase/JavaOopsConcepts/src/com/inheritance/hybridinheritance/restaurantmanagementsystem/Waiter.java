package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {
	protected int assignedTable;

	public Waiter(String name, int id, int assignedTable) {
		super(name, id);
		this.assignedTable = assignedTable;
	}
	
	@Override
	public void showDetails() {
		super.showDetails();
	}
	
	@Override
	public void performDuties() {
		System.out.println("Waiter serves customers and takes orders.");
		System.out.println("Assigned table: " + assignedTable);
	}
}