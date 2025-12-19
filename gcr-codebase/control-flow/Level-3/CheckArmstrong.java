// Writing a program to check a number is armstrong or not	
import java.util.Scanner;
public class CheckArmstrong {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int number = sc.nextInt();
		int sum = 0, originalNumber = number;
		
		while(number != 0) {
			int digit = number % 10;
			sum = sum + digit * digit * digit;
			number /= 10;
		}
		if(originalNumber == sum) System.out.println(originalNumber + " is an Armstrong number");
		else System.out.println(originalNumber + " is not an Armstrong number");
	}
}