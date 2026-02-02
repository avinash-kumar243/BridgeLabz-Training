package com.questions.functionalinterface.comparator.student;

public class Student {
	private String name;
	private int roll;
	private int rank;
	private int age;
	
	public Student(String name, int roll, int rank, int age) {
		this.name = name;
		this.roll = roll;
		this.rank = rank;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public int getRank() {
		return rank;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Student [name: " + name + " || roll: " + roll + " || rank: " + rank + " || age: " + age + "]";
	}
}