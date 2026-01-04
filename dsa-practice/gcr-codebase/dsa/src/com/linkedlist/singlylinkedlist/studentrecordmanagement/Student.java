package com.linkedlist.singlylinkedlist.studentrecordmanagement;

public class Student {
	protected String name;
	protected int roll;
	protected int age;
	protected String grade;
	Student next;
	
	public Student(String name, int roll, int age, String grade) {
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.grade = grade;
		this.next = null;
	}
}