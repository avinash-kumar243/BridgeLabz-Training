// Writing a program to find the maximum number of handshakes among students.
import java.util.Scanner;
public class HandshakesCount {
	// Calculation of simple interest
	public int maxHandShake(int numberOfStudents) {
		return (numberOfStudents * (numberOfStudents - 1)) / 2;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for number of students
		System.out.println("Enter number of students : ");
		int numberOfStudents = sc.nextInt();
		
		// Calculating and displaying maximum number of possible handshakes
		HandshakesCount handshake = new HandshakesCount();
		int totalHandShake = handshake.maxHandShake(numberOfStudents);
		System.out.println("Total number of possible handshakes are : " + totalHandShake);
	}
}