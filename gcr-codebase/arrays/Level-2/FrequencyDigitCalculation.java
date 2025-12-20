// Writing a program to calculate marks, percentages, and grades of each student
import java.util.Scanner;
public class FrequencyDigitCalculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking a number as input
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		
		// Calculating the frequency of each digit
		int freqCount[] = new int[10];
		while(number != 0) {
			int digit = number % 10;
			freqCount[digit]++;
			number /= 10;
		}
		
		// Displaying the frequency of each digit
		for(int i=0; i<10; i++) {
			System.out.println("The frequency for digit " + i + " is - " + freqCount[i]); 
		}
	}
}