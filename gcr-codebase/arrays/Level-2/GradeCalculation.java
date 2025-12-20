import java.util.Scanner;
public class GradeCalculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of student : ");
		int number = sc.nextInt();
		
		double physicsMarks[] = new double[number];
		double chemistryMarks[] = new double[number];
		double mathMarks[] = new double[number];
		double percentage[] = new double[number];
		String grades[] = new String[number];
		
		// Taking user input of physics, chemistry, and maths marks
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in physics of student " + (i+1) + " : ");
			double marks = sc.nextDouble();
			if(marks < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				physicsMarks[i] = marks;
			}
		}
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in chemistry of student " + (i+1) + " : ");
			double marks = sc.nextDouble();
			if(marks < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				chemistryMarks[i] = marks;
			}
		}
		for(int i=0; i<number; i++) {
			System.out.print("\nEnter marks in maths of student " + (i+1) + " : ");
			double marks = sc.nextDouble();
			if(marks < 0) {
				System.out.println("Invalid marks! Please enter your marks again");
				i--;
			} else {
				mathMarks[i] = marks;
			}
		}
		
		// Displaying the marks, percentages, and grades of each student
		for(int i=0; i<number; i++) {
			percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3;
			
			if(percentage[i] >= 80) System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade A");
			else if(percentage[i] >= 70) System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade B");
			else if(percentage[i] >= 60) System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade C");
			else if(percentage[i] >= 50) System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade D");
			else if(percentage[i] >= 40) System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade E");
			else System.out.println("Student " + (i+1) + " - physics marks - " + physicsMarks[i] + ", chemistry marks - " + chemistryMarks[i] + ", mathMarks - " + mathMarks[i] + ", percentage marks - " + percentage[i] + ", Grade R");
		}
	}
}