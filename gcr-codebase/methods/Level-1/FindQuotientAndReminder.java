// Writing a program to print quotient and reminder of two numbers
import java.util.Scanner;
public class FindQuotientAndReminder {
	// Finding quotient of two numbers
	public int findQuotient(int num1, int num2) {
		return num1 / num2;
	}
	
	// Finding reminder of two numbers
	public int findReminder(int num1, int num2) {
		return num1 % num2;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of two numbers
		System.out.println("Enter 2 numbers : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		// Calling a method to print quotient and reminder of two numbers
		FindQuotientAndReminder obj = new FindQuotientAndReminder();
		int quotient = obj.findQuotient(number1, number2);
		int reminder = obj.findReminder(number1, number2);
		
		// Displaying the quotient and reminder of two numbers
		System.out.println("Reminder is : " + reminder + ", and quotient is : " + quotient + " of two numbers " + number1 + " and " + number2);
	}
}