// Writing a java program to calculate various trigonometric functions
import java.util.Scanner;
public class TrigonometricFunctions {
	public static double[] calculateTrigonometricFunctions(double angle) {
		// Convert angle to radians
		double radians = Math.toRadians(angle);
		
		// Calculating the trigonometric functions
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		
		// Storing result into the array
		double []result = new double[3];
		result[0] = sin;
		result[1] = cos;
		result[2] = tan;
		
		return result;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Generating a random angle
		double angle = Math.random() * 100;
		System.out.println("Angle in Degree is : " + angle);
		
		// Calling the method to calculate trigonometric functions values
		double result[] = calculateTrigonometricFunctions(angle);
		
		// Desplaying the result of the operations
		System.out.println("Trigonometric functions results are : ");
		for(double num : result) {
			System.out.print(num + " ");
		}
	}
}