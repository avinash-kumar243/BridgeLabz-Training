// Writing a program to print multiplication table
import java.util.Scanner;
public class PrintMultiplicationTable {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : "); 
		int number = sc.nextInt();
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = number * i;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(number + "*" + (i+1) + " = " + (number * (i+1)));
		}		
	}
}