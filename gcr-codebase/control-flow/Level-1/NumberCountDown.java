// Writing a program to check its spring season or not
import java.util.Scanner;
public class NumberCountDown {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a counter : ");
		int counter = sc.nextInt();
		
		while(counter >= 1) {
			System.out.println(counter);
			counter--;
		}
	}
}