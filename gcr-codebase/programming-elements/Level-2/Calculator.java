// Writing a java program to implement a basic calulator operations like addition, subtraction, multiplication, and division.
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]){
		// Created scanner object for taking the imput from user
		Scanner sc = new Scanner(System.in);
		
		// Taking user input of both number
		System.out.println("Enter First Number : ");
		float number1 = sc.nextFloat();
		System.out.println("Enter Second Number : ");
		float number2 = sc.nextFloat();

		// Calculating addition, subtraction, multiplication, and division of two numbers
		float addition = number1 + number2;
		float subtraction = number1 - number2;
		float multiplication = number1 * number2;
		float division = number1 / number2;
		
		// Displaying addition, subtraction, multiplication, and division of two numbers
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
	}
}