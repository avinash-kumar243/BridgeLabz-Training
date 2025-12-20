// Writing a program to calculate marks, percentages, and grades of each student
import java.util.Scanner;
public class GradeCalculationTwoDArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of student : ");
		int number = sc.nextInt();
		
		double marks[][] = new double[number][3];
		double percentage[] = new double[number];
		String grades[] = new String[number];
		
		// Taking user input of physics, chemistry, and maths marks
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in physics of student " + (i+1) + " : ");
			double mark = sc.nextDouble();
			if(mark < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				marks[i][0] = mark;
			}
		}
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in chemistry of student " + (i+1) + " : ");
			double mark = sc.nextDouble();
			if(mark < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				marks[i][1] = mark;
			}
		}
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in maths of student " + (i+1) + " : ");
			double mark = sc.nextDouble();
			if(mark < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				marks[i][2] = mark;
			}
		}
		
		// Displaying the marks, percentages, and grades of each student
		for(int i=0; i<number; i++) {
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
			
			if(percentage[i] >= 80) System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade A");
			else if(percentage[i] >= 70) System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade B");
			else if(percentage[i] >= 60) System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade C");
			else if(percentage[i] >= 50) System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade D");
			else if(percentage[i] >= 40) System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade E");
			else System.out.println("Student " + (i+1) + " - physics marks - " + marks[i][0] + ", chemistry marks - " + marks[i][1] + ", mathMarks - " + marks[i][2] + ", percentage marks - " + percentage[i] + ", Grade R");
		}
	}
}