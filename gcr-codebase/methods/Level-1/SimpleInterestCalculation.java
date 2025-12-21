// Writing a program that take calculate simple interest
import java.util.Scanner;
public class SimpleInterestCalculation {
	// Calculation of simple interest
	public double simpleInterest(double p, double t, double r) {
		return (p * r * t) / 100;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for principal, time, and rate of interest
		System.out.println("Enter Principal : ");
		double principal = sc.nextDouble();
		System.out.println("Enter Rate : ");
		double rate = sc.nextDouble();
		System.out.println("Enter Time : ");
		double time = sc.nextDouble();
		
		// Caculating and displaying simple interest
		SimpleInterestCalculation obj = new SimpleInterestCalculation();
		double simpleInterest = obj.simpleInterest(principal, time, rate);
		System.out.println("The Simple Interest is : " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time); 
	}
}