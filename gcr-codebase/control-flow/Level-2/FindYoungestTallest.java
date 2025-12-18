// Writing a program to find the youngest friends among 3 Amar, Akbar, and Anthony
import java.util.Scanner;
public class FindYoungestTallest {
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amar age : ");
		int age1 = sc.nextInt();
		System.out.println("Akbar age : ");
		int age2 = sc.nextInt();
		System.out.println("Anthony age : ");
		int age3 = sc.nextInt();
		System.out.println("Amar height : ");
		int height1 = sc.nextInt();
		System.out.println("Akbar height : ");
		int height2 = sc.nextInt();
		System.out.println("Anthony height : ");
		int height3 = sc.nextInt();
		
		if(age1 < age2 && age1 < age3) System.out.println("youngest friend is - Amar");
		else if(age2 < age1 && age2 < age3) System.out.println("youngest friend is - Akbar");
		else System.out.println("youngest friend is - Anthony");
		
		if(height1 > height2 && height1 > height3) System.out.println("tallest friend is - Amar");
		else if(height2 > height1 && height2 > height3) System.out.println("tallest friend is - Akbar");
		else System.out.println("tallest friend is - Anthony");
	}
}