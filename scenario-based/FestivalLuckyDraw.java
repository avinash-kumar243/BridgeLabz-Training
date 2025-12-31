// 20. Festival Lucky Draw 🎉
// At Diwali mela, each visitor draws a number.
// ● If the number is divisible by 3 and 5, they win a gift.
// ● Use if, modulus, and loop for multiple visitors.
// ● continue if input is invalid.


import java.util.Scanner;
public class FestivalLuckyDraw {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n------------------ Diwali Mela -------------------");
		
		while(true) {
			System.out.print("\n\nDraw a number randomly : ");
			int num = sc.nextInt();
			
			while(num <= 0) {
				System.out.println("Invalid Input! Enter a number again");
				num = sc.nextInt();
			}
			
			if(num % 3 == 0 && num % 5 == 0) System.out.println("Congratulations! You won 7 crores\n");
			else System.out.println("Try again\n");
			
			System.out.print("Enter \"yes\" to play again else \"no\" : ");
			String choise = sc.next();
			
			if(!choise.equalsIgnoreCase("yes")) break;
		}
	}
}