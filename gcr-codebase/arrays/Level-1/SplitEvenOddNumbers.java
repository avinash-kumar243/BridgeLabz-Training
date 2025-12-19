// Writing a program to split even and odd numbers in different arrays 
import java.util.Scanner;
public class SplitEvenOddNumbers {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// validate :- if not a natural number then terminate the program
		if(number <= 0) {
			System.err.println("Not a natural number");
			System.exit(0);
		}
		
		// creating even and odd arrys
		int even[] = new int[number / 2 + 1];
		int odd[] = new int[number / 2 + 1];
		int i = 0, j = 0;
		
		
		// spliting even and odd numbers
		for(int num = 1; num <= number; num++) {
			if(num % 2 == 0) even[i++] = num;
			else odd[j++] = num;
		}
		
		// Displaying even and odd numbers
		for(int k=0; k<i; k++) {
			System.out.println("Even Number : " + even[k]);
		}
		for(int k=0; k<j; k++) {
			System.out.println("Odd Number : " + odd[k]);
		}
	}
}