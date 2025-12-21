// Writing a program to check if a year is leap year or not
import java.util.Scanner;
public class LeapYear { 
	// Creating a method to check wheather Leap year or not
	public static boolean isLeapYear(int year) {
		if(year >= 1582) System.out.println("Valid year to check for leap year");
		else {
			System.err.println("Invalid year");
			System.exit(0);
		}
		
		// Leap year conditions
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) return true;
		else return false;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		// Calling a method to check leap year or not and print result
		if(isLeapYear(year)) System.out.println(year + " is a leap year");
		else System.out.println(year + " is not a leap year");
	}
}