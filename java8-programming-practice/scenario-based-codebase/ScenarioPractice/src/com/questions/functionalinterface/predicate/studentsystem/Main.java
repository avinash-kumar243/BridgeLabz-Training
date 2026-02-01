package com.questions.functionalinterface.predicate.studentsystem;

import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Komal", 72);
		Student s2 = new Student("Ravi", 86);
		
		
		// In a student system, use a Predicate to check if a student is eligible for exam (attendance ≥ 75%).
		Predicate<Student> p = stu -> stu.getAttendence() >= 75;
		
		System.out.println("Does Komal eligible for exam -> " + p.test(s1));
		System.out.println("Does Ravi elegible for exam -> " + p.test(s2));
	}
}