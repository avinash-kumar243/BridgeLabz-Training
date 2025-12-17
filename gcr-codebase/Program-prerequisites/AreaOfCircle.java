import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		int radius = sc.nextInt();
		
		double pi = 3.14;
		
		double areaOfCircle = pi * radius * radius;
		
		System.out.println("Area of circle is : " + areaOfCircle);
	}
}