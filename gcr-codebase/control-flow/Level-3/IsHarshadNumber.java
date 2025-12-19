// Writing a program to check if a number taken from the user is a Harshad Number
import java.util.Scanner;
public class IsHarshadNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int sum = 0, originalNumber = number;
		
		while(number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		if(originalNumber % sum == 0) System.out.println("Harshad Number");
		else System.out.println("Not a Harshad Number");
	}
}