// 7. The Number Guessing Game 🎲
// A game asks the player to guess a number between 1 and 100.
// Core Java Scenario Based Problem Statements
// ● Use do-while loop.
// ● Give hints like "Too high" or "Too low".
// ● Count attempts and exit after 5 wrong tries.



import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int guessNum = (int)(Math.random() * 99) + 1;
		
		int st = 1, end = 100, num = 0;
		int attempt = 0;
		boolean isValidNum = false;
		
		do {
			System.out.print("\nYour guess left : " + (5 - attempt));
			System.out.print("\nPlease enter a number within " + st + " and " + end + " : ");
			while(!isValidNum) {
				num = sc.nextInt();
				if(num >= st && num <= end) isValidNum = true;
				else {
					System.out.println(num + " is out of range! \nPlease Enter a number within " + st + " and " + end + " : ");
				}
			}
			isValidNum = false;
			
			if(num == guessNum) {
				System.out.println("\nCongratulations... Your won the Game.");
				break;
			} else if(num < guessNum) {
				System.out.println("Too Low");
				st = num;
			} else {
				System.out.println("Too High");
				end = num;
			}
			attempt++;
		} while(attempt < 5);
		
		if(attempt == 5) System.out.println("\nBetter luck Next Time");
	}
}