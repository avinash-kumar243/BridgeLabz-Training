// Writing a program to check whether the student can vote
import java.util.Scanner;
public class StudentVoteChecker {
	// Created a method to check whether the student can vote
	public boolean canStudentVote(int age) {
		if(age < 0) {
			System.out.println("Invalid age!");
			return false;
		}
		if(age >= 18) return true;
		else return false;		
	}	
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Creating an array to store age of 10 students and call for validation for vote
		int ages[] = new int[10];
		System.out.println("Enter age of 10 students : ");
		StudentVoteChecker obj = new StudentVoteChecker();
		for(int i=0; i<10; i++) {
			ages[i] = sc.nextInt();
			
			// Displaying weather a student can vote or not
			if(obj.canStudentVote(ages[i])) System.out.println("Student with age of " + ages[i] + " can vote \n");
			else System.out.println("Student with age of " + ages[i] + " cannot vote \n");
		}
	}
}