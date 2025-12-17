import java.util.Scanner;
public class VolumeOfCylinder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		double radius = sc.nextDouble();
		
		System.out.print("Enter Height: ");
		double height = sc.nextDouble();
		
		double volumeOfCylinder = 3.14 * radius * radius * height;
		
		System.out.println("Volume of Cylinder is : " + volumeOfCylinder);
	}
}