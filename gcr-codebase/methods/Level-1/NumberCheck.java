// Writing a program to check whether a number is positive, negative, or zero
import java.util.Scanner;
public class NumberCheck {
	// checking whether a number is positive, negative, or zero
	public int numberCheck(int number) {
		if(number == 0) return 0;
		else if(number > 0) return 1;
		else return -1;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for number
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// Writing a method to check whether a number is positive, negative, or zero
		NumberCheck obj = new NumberCheck();
		int status = obj.numberCheck(number);
		
		// Printing the status of a number
		if(status == 1) System.out.println("Number is Positive");
		else if(status == -1) System.out.println("Number is Negative");
		else System.out.println("Number is Zero");
	}
}