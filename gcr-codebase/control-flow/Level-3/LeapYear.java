// Writing a program to check if a year is leap year or not
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Year");
		int year = sc.nextInt();
		
		if(year >= 1582) System.out.println("Valid year to check for leap year");
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) System.out.println("Year is a leap year");
		else System.out.println("Year is not a leap year");
	}
}