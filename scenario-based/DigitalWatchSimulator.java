/* 16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/


import java.util.Scanner;
public class DigitalWatchSimulator {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("------------------ Digital Watch Simulation -------------------");
		System.out.println("---------------------------------------------------------------\n");
		
		// System.out.println("Enter the hours and minutes to start from there : ");
		// int hour = sc.nextInt();
		// int minute = sc.nextInt();
		
		for(int i = 0; i < 24; i++) {
			
			if(i == 13) { 	
				System.out.println("\n\n--------------------------------------------");
				System.out.println("It's 13:00 O'clock and Power has been cut.");
				System.out.println("--------------------------------------------\n\n");
				break;
			}
			
			System.out.println("\n\n---------------");
			for(int j = 0; j < 60; j++) {
				if(j == 0) {
					System.out.println("It's " + i + " O'clock ");
					System.out.println("---------------\n\n");
				}	
				
				if(i == 0 && j <= 9) System.out.printf("00 : 0%d \n", j);
				else if(i == 0) System.out.printf("00 : %d \n", j);
				else if(j <= 9) System.out.printf("%d : 0%d \n", i, j);
				else System.out.printf("%d : %d \n", i, j);
			}
		}
	}
}