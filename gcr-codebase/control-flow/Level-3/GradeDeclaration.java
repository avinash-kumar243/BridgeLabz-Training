// Writing a program to calculate the grade based on the percentage of obtained marks	
import java.util.Scanner;
public class GradeDeclaration {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter physics marks ");
		int physicsMarks = sc.nextInt();
		System.out.println("Enter chemistry marks ");
		int chemistryMarks = sc.nextInt();
		System.out.println("Enter maths marks ");
		int mathsMarks = sc.nextInt();
		
		int averageMarks = (physicsMarks + chemistryMarks + mathsMarks) / 3;
		System.out.println("Average marks : " + averageMarks);
		
		if(averageMarks >= 80) System.out.println("Grade - A, Remarks - (Level 4, above agency-normalized standards)"); 
		else if(averageMarks >= 70) System.out.println("Grade - B, Remarks - (Level 3, at agency-normalized standards)");
		else if(averageMarks >= 60) System.out.println("Grade - C, Remarks - (Level 2, below, but approaching agency-normalized standards)");
		else if(averageMarks >= 50) System.out.println("Grade - D, Remarks - (Level 1, well below agency-normalized standards)");
		else if(averageMarks >= 40) System.out.println("Grade - E, Remarks - (Level 1-, too below agency-normalized standards)");
		else System.out.println("Grade - R, Remarks - (Remedial standards)");
	}
}