// Writing a program to check if the first number is the smallest among three numbers
import java.util.Scanner;
public class IsFirstNumberSmallest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int number1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int number2 = sc.nextInt();
		System.out.println("Enter Third Number : ");
		int number3 = sc.nextInt();
		
		// Displaying if the first number is the smallest among three numbers or not
		System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
	}
}