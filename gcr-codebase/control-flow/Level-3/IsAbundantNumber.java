// Writing a program to check if a number is an Abundant Number
import java.util.Scanner;
public class IsAbundantNumber {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		int sum = 0, originalNumber = number;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) sum += i;
		}
		if(sum > originalNumber) System.out.println("Abundant Number");
		else System.out.println("Not a Abundant Number");
	}
}