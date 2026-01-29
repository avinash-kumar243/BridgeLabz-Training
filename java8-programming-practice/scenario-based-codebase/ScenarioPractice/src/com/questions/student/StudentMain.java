package com.questions.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Avinash kumar", 101, "Avinash", "CE", 23, "Male", "Bhopal", 100, List.of("111111"))); 
		students.add(new Student("Krishna kumar", 102, "Krishna", "CSE", 25, "Male", "Noida", 40, List.of("222222"))); 
		students.add(new Student("Deepika Roy", 103, "Deepika", "AIDS", 22, "Female", "Indore", 42, List.of("3333333", "1000000"))); 
		students.add(new Student("Priyanshu kumar", 104, "Priyanshu", "IT", 23, "Male", "Mumbai", 160, List.of("444444"))); 
		students.add(new Student("Deepak kumar", 105, "Deepak", "ME", 21, "Male", "Delhi", 25, List.of("555555"))); 
		students.add(new Student("Komal kumari", 106, "Komal", "ME", 26, "Female", "Mumbai", 12, List.of("666666"))); 
		students.add(new Student("Anjali Singh", 107, "Anjali", "CSE", 23, "Female", "Mumbai", 90, List.of("777777"))); 
		students.add(new Student("Devika kumari", 108, "Devika", "EC", 24, "Female", "Bhopal", 78, List.of("888888"))); 
		students.add(new Student("Rohan kumar", 109, "Rohan", "AIDS", 27, "Male", "Pune", 112, List.of("999999", "999"))); 
		

		
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
		
		
		// Problem 16 :- Find the department with the highest average rank.
		String department = students.stream()
								   .collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getRank)))
								   .entrySet()
								   .stream()
								   .max(Comparator.comparing(Map.Entry::getValue))
								   .get()
								   .getKey();
		
		System.out.println("\n16. Department with highest average rank: " + department);
		
		
		
		// Problem 17 :- Find the student with the best (lowest) rank.
		System.out.println("\n17. Student with best rank is: ");
		System.out.println(students.stream()
								   .min(Comparator.comparingInt(Student::getRank)).get());
		
		
		// Problem 18 :- Find the student with the worst (highest) rank.
		System.out.println("\n18. The student with the worst (highest) rank is: ");
		System.out.println(students.stream()
								   .max(Comparator.comparing(Student -> Student.getRank())).get());
		
		
		// Problem 19 :- Find the second best rank holder.
		System.out.println("\n19. Second best rank holder: ");
		System.out.println(students.stream()
								   .sorted(Comparator.comparing(Student::getRank))
								   .skip(1)
								   .findFirst()
								   .get());
		
		
		// Problem 20 :- Find the third best rank holder.
		System.out.println("\n20. The third best rank holder is: ");
		System.out.println(students.stream()
								   .sorted(Comparator.comparing(Student::getRank))
								   .skip(2)
								   .min(Comparator.comparing(Student::getRank))
								   .get());
		
		
		// Problem 21 :- Find the youngest student.
		System.out.println("\n21. Youngest student is: ");
		System.out.println(students.stream()
								   .min(Comparator.comparing(Student::getAge))
								   .get());
		
		
		// Problem 22 :- Find the oldest student.
		System.out.println("\n22. Oldest student is: ");
		System.out.println(students.stream()
								   .max(Comparator.comparing(Student::getAge))
								   .get());
		
		
		// Problem 23 :- Print all contact numbers of all students
		System.out.println("\n23. All contact numbers of all students are: ");
		students.stream()
				.map(Student::getContacts)
				.forEach(System.out::println);
		
		
		// Problem 24 :- Count the total number of contact numbers.
		System.out.print("\n24. Count the total number of contact numbers: ");
		System.out.println(students.stream()
								   .count());
		
		
		// Problem 25 :- Find students who have more than one contact number.
		System.out.println("\n25. Students who have more than one contact number are: ");
		students.stream()
				.filter(s -> s.getContacts().size() > 1)
				.forEach(System.out::println);
		
		
		// Problem 26 :- Check if any student belongs to CSE.
		boolean hasCSEStudent = students.stream()
										.anyMatch(s -> "CSE".equalsIgnoreCase(s.getDepartment()));
		System.out.println("\n26. Checking if any student belongs to CSE : " + hasCSEStudent);
		
		
		// Problem 27 :- Check if all students are above age 20.
		boolean isStudentAbove20 = students.stream()
				.allMatch(student -> student.getAge() > 20); 
		System.out.println("\n27. Are all students above 20 : " + isStudentAbove20); 
		
		
		// Problem 28 :- Check if no student belongs to CE.
		boolean noCEStudent = students.stream()
									  .noneMatch(student -> student.getDepartment().equalsIgnoreCase("CE"));
		System.out.println("\n28. No students belong to CE department : " + noCEStudent);
		
		
		// Problem 29 :- Count male and female students.
		System.out.println("\n29. Total Count of male and female students : ");
		System.out.println(students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting())));
		
		
		// Problem 30 :- Find the average age of male students.
		System.out.print("\n30. Average age of male students: ");
		System.out.println(students.stream()
				.filter(student -> student.getGender().equalsIgnoreCase("Male"))
				.collect(Collectors.averagingInt(Student::getAge)));
		
		
		// Problem 31 :- Find the average age of female students
		System.out.print("\n31. Average age of female students: ");
		System.out.println(students.stream()
								   .filter(student -> student.getGender().equalsIgnoreCase("Female"))
								   .collect(Collectors.averagingInt(Student::getAge)));
		
		
		// Problem 32 :- Find the highest ranked male student.
		System.out.println("\n32. Highest ranked male student: ");
		students.stream()
			    .filter(student -> student.getGender().equalsIgnoreCase("Male"))
			    .min(Comparator.comparing(Student::getRank)) 
			    .ifPresentOrElse(System.out::println, () -> System.out.println("No male student found"));
		
		
		
		// Problem 33 :- Find the highest ranked female student.
		System.out.println("\n33. Highest ranked female student: ");
		students.stream()
			    .filter(student -> student.getGender().equalsIgnoreCase("Female"))
			    .min(Comparator.comparing(Student::getRank)) 
			    .ifPresentOrElse(System.out::println, () -> System.out.println("No Female student found"));

		 
	}
}