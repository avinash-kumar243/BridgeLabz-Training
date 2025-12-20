// Writing a program to calculate the bonus of employees based on their years of service
import java.util.*;
public class SalaryBonus {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		// Declaring the array of salary and year of service
		double salary[] = new double[10];
		double yearsOfService[] = new double[10];
		double bonus[] = new double[10];
		
		// Taking input from the user for salary and year of service
		System.out.println("Enter Salary of 10 employees : ");
		for(int i=0; i<salary.length; i++) {
			salary[i] = sc.nextDouble();
			if(salary[i] < 0) {
				System.out.println("Invalid salary. Please Enter your salary again : ");
				i--;
			}
		}
		System.out.println("Enter years of service of 10 employees : ");
		for(int i=0; i<yearsOfService.length; i++) {
			yearsOfService[i] = sc.nextDouble();
			if(yearsOfService[i] < 0) {
				System.out.println("Invalid year of service. Please Enter your year of service again : ");
				i--;
			}
		}
		
		// Calculating and displaying total bonus
		for(int i=0; i<bonus.length; i++) {
			if(yearsOfService[i] > 5) bonus[i] = salary[i] * 0.05;
			else bonus[i] = salary[i] * 0.02;
		}
		for(int i=0; i<bonus.length; i++) {
			System.out.println("Total bonus of employee " + (i+1) + " is : " + bonus[i]);
			System.out.println("Total old salary of employee " + (i+1) + " is : " + salary[i]);
			System.out.println("Total new salary of employee " + (i+1) + " is : " + (salary[i] + bonus[i]) + "\n");
		}
	}
}