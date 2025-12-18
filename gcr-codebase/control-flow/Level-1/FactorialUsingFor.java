// Writing a program to find the factorial of a number using for loop
import java.util.Scanner;
public class FactorialUsingFor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		if(number >= 0) {
			int factorial = 1;
			for(int num=number; num>0; num--) { 
				factorial *= num;
			}
			System.out.println("Factorial of " +  number + " is " + factorial);
		}
	}
}