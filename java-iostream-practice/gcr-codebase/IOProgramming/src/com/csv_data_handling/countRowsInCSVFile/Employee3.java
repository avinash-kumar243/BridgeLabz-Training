package com.csv_data_handling.countRowsInCSVFile;

public class Employee3 {
	int ID;
	String name;
	int age;
	int salary;
	
	public Employee3(int iD, String name, int age, int salary) {
		ID = iD;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	 
	public String toCSV() {
		return "Id: " + ID + ", name: " + name + ", age: " + age + ", salary: " + salary + "\n"; 
	}
} 