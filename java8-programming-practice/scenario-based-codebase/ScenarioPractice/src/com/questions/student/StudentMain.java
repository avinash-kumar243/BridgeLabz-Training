package com.questions.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Avinash kumar", 101, "Avinash", "CE", 23, "Male", "Bhopal", 100, "111111")); 
		students.add(new Student("Krishna kumar", 102, "Krishna", "CSE", 25, "Male", "Noida", 40, "222222")); 
		students.add(new Student("Deepika Roy", 103, "Deepika", "AIDS", 22, "Female", "Indore", 42, "333333")); 
		students.add(new Student("Priyanshu kumar", 104, "Priyanshu", "IT", 23, "Male", "Mumbai", 160, "444444")); 
		students.add(new Student("Deepak kumar", 105, "Deepak", "ME", 21, "Male", "Delhi", 25, "555555")); 
		students.add(new Student("Komal kumari", 106, "Komal", "ME", 26, "Female", "Mumbai", 12, "666666")); 
		students.add(new Student("Anjali Singh", 107, "Anjali", "CSE", 23, "Female", "Mumbai", 90, "777777")); 
		students.add(new Student("Devika kumari", 108, "Devika", "EC", 24, "Female", "Bhopal", 78, "888888")); 
		students.add(new Student("Rohan kumar", 109, "Rohan", "AIDS", 27, "Male", "Pune", 112, "999999")); 
		

		
		// Problem 1 :- Print all students whose rank is less than 50
		System.out.println("\n1. All students whose rank is less than 50 are: ");
		students.stream()
				.filter(Student -> Student.getRank() <= 50)
				.forEach(System.out::println);
		
		
		// Problem 2 :- Print all students whose age is greater than 25.
		System.out.println("\n2. All students whose age is greater than 25 are: ");
		students.stream()
				.filter(student -> student.getAge() > 25)
				.forEach(System.out::println);
		
		
		// Problem 3 :- Print the names of all students only.
		System.out.println("\n3. All students names are: ");
		students.stream()
				.map(Student :: getName)
				.forEach(System.out::println);
		
		
		// Problem 4 :- Print all students belonging to Mechanical Engineering.
		System.out.println("\n4. All students belonging to Mechanical Engineering are: ");
		students.stream()
				.filter(Student -> Student.getDepartment().equals("ME"))
				.forEach(System.out::println);
		
		
		// Problem 5 :- Print all students not from Mumbai.
		System.out.println("\n5. All students not from Mumbai are: ");
		students.stream()
				.filter(Student -> !Student.getCity().equals("Mumbai"))
				.forEach(System.out::println);
		
		
		
		// Problem 6 :- Sort students by rank (ascending)
		System.out.println("\n6. Sort students by rank (ascending).");
		students.stream()
				.sorted(Comparator.comparing(Student::getRank))
				.forEach(System.out::println);
		
		
		// Problem 7 :- Sort students by age (descending)
		System.out.println("\n7. Sort students by age (descending).");
		students.stream()
				.sorted(Comparator.comparing(Student::getAge).reversed())
				.forEach(System.out::println);
		
		
		// Problem 8 :- Print top 5 students based on rank.
		System.out.println("\n8. Print top 5 students based on rank.");
		students.stream()
				.sorted(Comparator.comparing(Student::getRank))
				.limit(5)
				.forEach(System.out::println);
		
		
		// Problem 9 :- Print last 3 students based on rank.
		System.out.println("\n9. Print last 3 students based on rank.");
		students.stream()
				.sorted(Comparator.comparing(Student::getRank).reversed())
				.limit(3)
				.forEach(System.out::println);
		
		
		// Problem 10 :- Print students sorted by name and then rank.
		System.out.println("\n10. Print students sorted by name and then rank.");
		students.stream()
				.sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank))
				.forEach(System.out::println);
		
		
		// Problem 11 :- Count the number of students in each department.
		System.out.println("\n11. Total count of students in each department.");
		System.out.println(students.stream()
								   .collect(Collectors.groupingBy(Student :: getDepartment, Collectors.counting())));
				
		
		// Problem 12 :- Count the number of students in each city.
		System.out.println("\n12. Count the number of students in each city.");
		System.out.println(students.stream()
								   .collect(Collectors.groupingBy(Student :: getCity, Collectors.counting())));
		
		
		// Problem 13 :- Find the average age of students in each department.
		System.out.println("\n13. The average age of students in each department.");
		System.out.println(students.stream()
								   .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getAge))));
		
		
		// Problem 14 :- Find the average rank of students by gender.
		System.out.println("\n14. The average rank of students by gender."); 
		System.out.println(students.stream()
				                   .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank))));
		
		
		// Problem 15 :- Find the total number of students in the organization.
		System.out.println("\n15. The total number of students in the organization.");
		System.out.println(students.stream()
								   .collect(Collectors.counting()));
		
		
		
		
	}
}