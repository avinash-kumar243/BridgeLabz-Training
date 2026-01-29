package com.questions.student;

import java.util.List;

public class Student {
	private String name;
	private int id;
	private String firstName;
	private String department;
	private int age;
	private String gender;
	private String city;
	private int rank;
	private List<String> contacts;
	
	public Student(String name, int id, String firstName, String department, int age, String gender, String city, int rank, List<String> contacts) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}

	// Getters for Student details
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getDepartment() {
		return department;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getCity() {
		return city;
	}
	public int getRank() {
		return rank;
	}
	public List<String> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", firstName=" + firstName + ", department=" + department + ", age=" + age + ", gender="
				+ gender + ", city=" + city + ", rank=" + rank + ", contacts=" + contacts + "]";
	}
}