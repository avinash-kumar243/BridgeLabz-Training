package com.collectors.studentresultgrouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		// List of Students
		List<Student> students = List.of(new Student(101, "Avi", 'B'),
										 new Student(102, "Allu", 'A'),
										 new Student(103, "Pooja", 'B'),
										 new Student(104, "Rohan", 'C'),
										 new Student(105, "Deepak", 'A'),
										 new Student(106, "Komal", 'C'),
										 new Student(107, "Anuj", 'A'),
										 new Student(108, "Kangana", 'B'));
		
		// Grouping By operations
		Map<Character, List<String>> result = students.stream()
				.collect(Collectors.groupingBy(Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));
		
		// Displaying student grade and their names
		for(Map.Entry<Character, List<String>> emt : result.entrySet()) {
			char grade = emt.getKey();
			List<String> studentsName = emt.getValue();
			
			System.out.println(grade + " -> " + studentsName);
		}
	}
}