// Writing a program to check if the first, second, or third number is the largest among all three numbers
import java.util.Scanner;
public class LargestNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int number3 = sc.nextInt();
		
		// Displaying is first, second, or third number is the largest among all three numbers
		System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
		System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
		System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
	}
}