package com.questions.java8_conversionlogical.list_to_map_conversion;

public class Employee {
	private String name;
	private int salary;
	private int id;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [name: " + name + " || salary: " + salary + " || id: " + id + "]";
	}
}