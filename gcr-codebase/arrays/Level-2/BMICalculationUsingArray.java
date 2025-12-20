// Writing a program to calculate height, weight, BMI and status of number of persons
import java.util.*;
public class BMICalculationUsingArray {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Taking an input from user for a number of persons
		System.out.println("Enter number of persons : ");
		int number = sc.nextInt();
		
		double weight[] = new double[number];
		double height[] = new double[number];
		
		System.out.println("Enter weight of " + number + " persons : ");
		for(int i=0; i<number; i++) {
			weight[i] = sc.nextDouble();
		}
		System.out.println("Enter height of " + number + " persons : ");
		for(int i=0; i<number; i++) {
			height[i] = sc.nextDouble();
		}
		
		double bmi[] = new double[number];
		String weightStatus[] = new String[number];
		
		// Calculating the height, weight, BMI and status of each individual
		for(int i=0; i<number; i++) {
			bmi[i] = weight[i] / ((height[i] * height[i]) / 10000);
			
			if(bmi[i] <= 18.4) weightStatus[i] = "Underweight";
			else if(bmi[i] <= 24.9) weightStatus[i] = "Normal";
			else if(bmi[i] <= 39.9) weightStatus[i] = "Overweight";
			else weightStatus[i] = "Obese";
		}
		
		// Displaying the height, weight, BMI and status of each individual
		for(int i=0; i<number; i++) {
			System.out.println("The height of the person " + (i+1) + " is " + height[i]);
			System.out.println("The weight of the person " + (i+1) + " is " + weight[i]);
			System.out.println("The BMI of the person " + (i+1) + " is " + bmi[i]);
			System.out.println("The weight status of the person " + (i+1) + " is " + weightStatus[i] + "\n");
		}
	}
}