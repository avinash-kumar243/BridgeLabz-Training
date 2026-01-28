package com.questions.employee;


// POJO Employee class
public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int joiningYear;
	private int salary;
	
	public Employee(int id, String name, int age, String gender, String department, int joiningYear, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.joiningYear = joiningYear;
		this.salary = salary;
	}
	
	
	// Getters for employee details
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	} 
	public int getJoiningYear() {
		return joiningYear;
	}
	public int getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", joiningYear=" + joiningYear + ", salary=" + salary + "]";
	}
}