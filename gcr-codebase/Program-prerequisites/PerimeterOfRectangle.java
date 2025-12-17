import java.util.Scanner;
public class PerimeterOfRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		int length = sc.nextInt();
		
		System.out.print("Enter Width: ");
		int width = sc.nextInt();
		
		int perimeter = 2 * (length + width);
		System.out.println("Perimeter of Rectangle is : " + perimeter);
	}
}