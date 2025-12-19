// Writing a program to find number of digits in a number	
import java.util.Scanner;
public class countDigitInANumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int number = sc.nextInt();
		int count = 0;
		
		while(number != 0) {
			int digit = number % 10;
			count++;
			number /= 10;
		}
		System.out.println("Total number of digits are " + count); 
	}
}