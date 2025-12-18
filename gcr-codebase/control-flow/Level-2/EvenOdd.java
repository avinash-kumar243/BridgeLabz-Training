// Writing a program to print even or odd from 1 to number
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		if(number >= 0) {
			for(int num = 1; num <= number; num++) {
				if(num % 2 == 0) System.out.println("Even " + num);
				else System.out.println("Odd " + num);
			}
		}
	}
}