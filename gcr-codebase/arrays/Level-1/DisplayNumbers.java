// Writing a program to display numbers and calculate sum of all numbers 
import java.util.Scanner;
public class DisplayAndCalulateSum {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double[10];
		double total = 0.0;
		int idx = 0;
		
		System.out.println("Enter numbers : ");
		while(true) {
			double num = sc.nextDouble();
			if(num <= 0) break;
			arr[idx] = num;
			idx++;
			if(idx == 10) break;
		}
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println("Sum of all numbers are : " + total); 
	}
} 