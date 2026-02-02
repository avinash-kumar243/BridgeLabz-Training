package com.questions.functionalinterface.consumer.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Avinash kumar", 101, 85, 24)); 
		students.add(new Student("Krishna kumar", 102, 68, 25));
		students.add(new Student("Deepika Roy", 103, 48, 21));
		students.add(new Student("Priyanshu kumar", 104, 94, 22));
		students.add(new Student("Deepak kumar", 105, 64, 26));
		students.add(new Student("Komal kumari", 106, 68, 25));
		students.add(new Student("Anjali Singh", 107, 53, 21)); 
		
		
		// Print student details using Consumer.
		System.out.println("----------------- Printing student details using Consumer ---------------\n");
		
		Consumer<Student> printStudentDetails = student -> System.out.println(student);
		
		students.stream()
				.forEach(printStudentDetails);
	}
}