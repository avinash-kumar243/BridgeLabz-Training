// Writing a program to find the smallest and the largest of the 3 numbers
import java.util.Scanner;
public class FindSmallestAndLargest {
	// finding the smallest and the largest of the 3 numbers
	public void findSmallestAndLargest(int num1, int num2, int num3) {
		// Finding smallest
		if(num1 < num2 && num1 < num3) System.out.println(num1 + " is Smallest");
		else if(num2 < num1 && num2 < num3) System.out.println(num2 + " is Smallest");
		else System.out.println(num3 + " is Smallest");
		
		// Finding largest
		if(num1 > num2 && num1 > num3) System.out.println(num1 + " is Largest");
		else if(num2 > num1 && num2 > num3) System.out.println(num2 + " is Largest");
		else System.out.println(num3 + " is Largest");
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of a number
		System.out.println("Enter 3 numbers : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		// Calling a method to find smallest and largest number omong 3 numbers
		FindSmallestAndLargest obj = new FindSmallestAndLargest();
		obj.findSmallestAndLargest(number1, number2, number3);
	}
}