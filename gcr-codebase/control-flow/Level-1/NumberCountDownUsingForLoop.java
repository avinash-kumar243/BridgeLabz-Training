// Writing a program to print counter till one using for loop
import java.util.Scanner;
public class NumberCountDownUsingForLoop {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a counter : ");
		int counter = sc.nextInt();
		
		for(int i=counter; i>=1; i--) {
			System.out.println(i);
		}
	}
}