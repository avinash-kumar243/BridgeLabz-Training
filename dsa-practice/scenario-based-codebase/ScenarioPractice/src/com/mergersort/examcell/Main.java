package com.mergersort.examcell;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentRankGenerator studentRankGenerator = new StudentRankGenerator();
		
		
		System.out.println("\n-----------------------Exam Cell (Student Rank Generator)-----------------------\n");
		while(true) {
			System.out.println("\nEnter 1 to view all student records");
			System.out.println("Enter 2 to add a student record");
			System.out.println("Enter 3 to sort students record");
			System.out.println("Enter 4 to exit");

			int choice = sc.nextInt();
					
			int marks;
			switch(choice) {
				case 1: 
					studentRankGenerator.showStudentRecords();
					break;
					
				case 2: 
					System.out.print("Enter student name: ");
					String name = sc.next();
					
					while(true) {
						System.out.print("Enter student marks: ");
						if(sc.hasNextInt()) {
							marks = sc.nextInt();
							break;
						}
						else {
							System.out.println("\nPlease enter a valid marks.");
							sc.next();
						}
					}
										
					studentRankGenerator.addStudentRecord(new Student(name, marks));
					break;
					
				case 3:
					studentRankGenerator.sortStudentRecords();
					break;
					
				case 4:
					System.out.println("Use me again!");
					return;
					
				default:
					System.out.println("Invalid choice!!!");
			}
		}
	}
}