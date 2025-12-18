import java.util.Scanner;
public class PrintQuotientAndReminder {
	public static void main(String args[]) {
		// Creating a scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		int quotient = number1 / number2;
		int reminder = number1 % number2;
		
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
	}
}