import java.util.Scanner;
public class AverageOfThreeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter Third Number : ");
		int num3 = sc.nextInt();
		
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Simple Interest is : " + simpleInterest);
	}
}