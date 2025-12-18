// Writing a java program to calculate Area of Triangle in square inches and square centimeters
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String args[]) {
		// Creating a scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		// Taking inputs from user
		System.out.println("Enter Base : ");
		int base = sc.nextInt();
		System.out.println("Enter Height : ");
		int height = sc.nextInt();
		
		// Calculating are of triangle in square inches and in square centimeters
		double areaOfTriangleInSquareInch = 0.5 * base * height;
		double areaOfTriangleInSquareCM = areaOfTriangleInSquareInch * 2.54 * 2.54;
		
		// Displaying area of triangle in square inches and in square centimeters
		System.out.println("The Area of the triangle in sq in is " + areaOfTriangleInSquareInch + " and sq cm is " + areaOfTriangleInSquareCM);
	}
}