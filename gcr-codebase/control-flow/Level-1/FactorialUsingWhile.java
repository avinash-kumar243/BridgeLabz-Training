// Writing a program to find the factorial of a number 
import java.util.Scanner;
public class FactorialUsingWhile {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		int num = number;
		if(num >= 0) {
			int factorial = 1;
			while(num > 0) {
				factorial *= num;
				num--;
			}
			System.out.println("Factorial of " +  number + " is " + factorial);
		}
	}
}