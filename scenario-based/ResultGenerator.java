import java.util.Scanner;
public class ResultGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects (out of 100) : ");

        // For-loop to take marks input
        for(int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + " : ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;
        System.out.println("\nAverage Marks = " + average);

        // Convert average to grade bucket
        int gradeKey = (int) average / 10;
        char grade;
		
        switch(gradeKey) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("Grade Awarded = " + grade);
    }
}