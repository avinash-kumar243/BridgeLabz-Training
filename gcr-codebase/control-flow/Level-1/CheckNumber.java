// Writing a program to check if a number is positive, negative or zero
import java.util.Scanner;
public class CheckNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number > 0) System.out.println("Positive Number");
		else if(number < 0) System.out.println("Negative Number");
		else System.out.println("Zero");
	}
}