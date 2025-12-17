// Writing a java program to convert height from centimeter to feet and inches
import java.util.Scanner;
public class ConversionOfHeight {
	public static void main(String args[]) {
		// Created a scanner object for taking the user input
		Scanner sc = new Scanner(System.in);
		
		// Taking height from the user
		double height = sc.nextDouble();
		
		// Calculating feet and inches from centimeter
		double totalInches = height / 2.54;
		int feet = (int)totalInches / 12;
		double inch = totalInches % 12;
		
		// Displaying actual height, and converted feet and inches
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inch);
	}
}	