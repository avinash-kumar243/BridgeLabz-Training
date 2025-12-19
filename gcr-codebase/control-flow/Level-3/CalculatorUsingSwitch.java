// Writing a program to create a calculator using switch cases
import java.util.Scanner;
public class CalculatorUsingSwitch {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		double first = sc.nextDouble();
		System.out.println("Enter second number ");
		double second = sc.nextDouble();
		System.out.println("Enter a string ");
		String op = sc.next();
		
		//for(int i=1; i<
		
		switch(op) {
			case "+": 
				System.out.println("sum is " + (first + second));
				break;
				
			case "-": 
				System.out.println("Difference is " + (first - second));
				break;
				
			case "*": 
				System.out.println("Multiplication is " + (first * second));
				break;
				
			default: 
				System.out.println("Division is " + (first / second));
		}
	}
}