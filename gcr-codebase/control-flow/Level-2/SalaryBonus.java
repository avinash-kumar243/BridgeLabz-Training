// Writing a program to find the bonus on salary of employees, based on their years of service
import java.util.Scanner;
public class SalaryBonus {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		System.out.println("Enter year of service : ");
		int serviceYear = sc.nextInt();
		
		double bonus = 0;
		if(serviceYear > 5) bonus = (double)salary * 0.05;
		
		System.out.println(bonus);
	}
}