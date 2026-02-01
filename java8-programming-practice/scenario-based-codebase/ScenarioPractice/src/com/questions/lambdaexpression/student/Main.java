package com.questions.lambdaexpression.student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student("Avi", 24, 68, 3),
										 new Student("Ravi", 25, 92, 1),
										 new Student("Komal", 16, 64, 4),
										 new Student("Deepak", 18, 22, 7),
										 new Student("Sonam", 26, 78, 2),
										 new Student("Pintu", 17, 15, 8),
										 new Student("Sachin", 22, 62, 5),
										 new Student("Aman", 19, 58, 6));
		int passingMarks = 50;
		
		
		// 1. Use a lambda expression to print a welcome message for a student.
		System.out.println("\n1. ------------ Printing welcome message ------------");
		students.stream()
				.forEach(student -> System.out.println("Welcome " + student.getName()));
		
		
		// 2. Use lambda to check if a student is pass or fail based on marks.
		System.out.println("\n2. ------------ All pass students ------------");
		Predicate<Student> p = student -> student.getMarks() >= passingMarks;
		students.stream()
				.filter(p)
				.forEach(System.out::println);
		
		
		// 3. Sort students by name using lambda.
		System.out.println("\n3. -------------- Sort students by name --------------");
		students.stream()
				.sorted(Comparator.comparing(student -> student.getName()))
				.forEach(student -> System.out.println(student));
		
		
		// 4. Sort students by rank using lambda.
		System.out.println("\n4. ---------------- Sort students by rank ---------------");
		students.stream()
				.sorted(Comparator.comparing(student -> student.getRank()))
				.forEach(System.out::println);
		
		
		// 5. Use lambda to display students whose age is above 18.
		System.out.println("\n5. ---------------- Display students whose age is above 18 ---------------");
		students.stream()
				.filter(student -> student.getAge() > 18)
				.forEach(System.out::println);
		
	}
}