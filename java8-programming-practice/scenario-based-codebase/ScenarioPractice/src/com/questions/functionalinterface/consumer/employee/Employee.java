package com.questions.functionalinterface.consumer.employee;

import java.time.LocalTime;

public class Employee {
	private String name;
	private String id;
	private LocalTime time;
	
	public Employee(String name, String id, LocalTime time) {
		this.name = name;
		this.id = id;
		this.time = time;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public LocalTime getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return "Employee [name: " + name + " || id: " + id + " || Login time: " + time + "]";
	}
}