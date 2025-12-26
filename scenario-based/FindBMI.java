// Maya is a fitness coach who wants to calculate BMI for her clients.

// Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. Use meaningful variable names and proper comments to maintain clean code.


// create a class to find BMI of a person
import java.util.*;
public class FindBMI{
    public static void main(String args []){

		Scanner sc =  new Scanner(System.in);

		// Get input from the user

		System.out.println("Enter height:");
		double height = sc.nextDouble();
		
		System.out.println("Enter weigth:");
		double weight = sc.nextDouble();
		
		double bmi = weight / ((height * height) / 10000);

		if(bmi <= 18.4) System.out.println("Underweight");
		else if(bmi <= 24.9) System.out.println("Normal");
		else if(bmi <= 39.9) System.out.println("Overweight");
		else System.out.println("Obese");
    }	
}