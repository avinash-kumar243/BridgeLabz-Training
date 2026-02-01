package com.questions.lambdaexpression.employee;

public class Employee {
	private String id;
	private int salary;
	private int experience;
	
	public Employee(String id, int salary, int experience) {
		this.id = id;
		this.salary = salary;
		this.experience = experience;
	}

	public String getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public int getExperience() {
		return experience;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", experience=" + experience + "]";
	}
}