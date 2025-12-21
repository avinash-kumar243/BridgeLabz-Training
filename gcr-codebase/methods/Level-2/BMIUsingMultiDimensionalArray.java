// Writing a program to calculate height, weight, BMI and status of number of persons
import java.util.*;
public class BMIUsingMultiDimensionalArray {
	
	// A method that will calculate the BMI of every person
	public static void calculateBMI(double personData[][]) {
		for(int i=0; i<personData.length; i++) {
			personData[i][2] = personData[i][0] / ((personData[i][1] * personData[i][1]) / 10000);
		}
	}
	
	
	// A method that will calculate weight Status of every person
	public static String[] determineWeightStatus(double personData[][]) {
		int number = personData.length;
		String weightStatus[] = new String[number];
		
		for(int i=0; i<number; i++) {
			if(personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
			else if(personData[i][2]<= 24.9) weightStatus[i] = "Normal";
			else if(personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
			else weightStatus[i] = "Obese";
		}
		return weightStatus;
	}
	
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		int number = 10;
		double[][] personData = new double[number][3];
		
		// Taking weight and storing into 2D array
		System.out.println("Enter weight of " + number + " persons : ");
		for(int i=0; i<number; i++) {
			double weight = sc.nextDouble();
			if(weight < 0) {
				System.out.println("Invalid weight! Please enter your weight again");
				i--;
			} else {
				personData[i][0] = weight;
			}
		}
		
		// Taking height and storing into 2D array
		System.out.println("Enter height of " + number + " persons : ");
		for(int i=0; i<number; i++) {
			double height = sc.nextDouble();
			if(height < 0) {
				System.out.println("Invalid height! Please enter your height again");
				i--;
			} else {
				personData[i][1] = height;
			}
		}
		
		// Detemining BMI and weight status of persons
		calculateBMI(personData);
		String weightStatus[] = determineWeightStatus(personData);
		
		
		// Displaying height, weight, BMI and status of every persons
		for(int i=0; i<number; i++) {
			System.out.println("The weight of the person " + (i+1) + " is " + personData[i][0]);
			System.out.println("The height of the person " + (i+1) + " is " + personData[i][1]);
			System.out.println("The BMI of the person " + (i+1) + " is " + personData[i][2]);
			System.out.println("The weight status of the person " + (i+1) + " is " + weightStatus[i] + "\n");
		}
	}
}