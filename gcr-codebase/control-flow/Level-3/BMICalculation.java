// Writing a program to calculate BMI of a person	
import java.util.Scanner;
public class BMICalculation {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight ");
		double weight = sc.nextDouble();
		System.out.println("Enter height ");
		double height = sc.nextDouble();
		
		double bmi = weight / ((height * height) / 10000);
		
		if(bmi <= 18.4) System.out.println("Underweight");
		else if(bmi <= 24.9) System.out.println("Normal");
		else if(bmi <= 39.9) System.out.println("Overweight");
		else System.out.println("Obese");
	}
}