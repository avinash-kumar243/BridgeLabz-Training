// Writing a program to find the roots of the equation
import java.util.*;
public class QuadraticOperation {
	public static double[] findRoots(double a, double b, double c, double delta) {
		
		if(delta < 0) return new double[] {};
		else if(delta == 0) {
			double root = -b / (2 * a);
			return new double[] {root};
		} else {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			return new double[] {root1, root2};
		}
	}
	
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a : ");
		double a = sc.nextDouble();
		System.out.println("Enter b : ");
		double b = sc.nextDouble();
		System.out.println("Enter c : ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double result[] = findRoots(a, b, c, delta);
		
		if(result.length == 0) System.out.println("No real roots");
		else if(result.length == 1) System.out.println("One root : " + result[0]);
		else System.out.println("The two roots are " + result[0] + " and " + result[1]);
	}
}