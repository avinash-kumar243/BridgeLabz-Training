/* 13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/


import java.util.Scanner;
public class FitnessTracker {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("---------------- Fitness Challenge Tracker ----------------");
		System.out.println("-----------------------------------------------------------\n\n");
		
		System.out.print("Enter number of week to track fitness : ");
		int week = sc.nextInt();
		
		while(week <= 0) {
			System.out.print("\nInvalid input. Please enter number of week again : ");
			week = sc.nextInt();
		}
		
		int days[] = new int[7*week];
		
		// Take user input for push-ups everyday
		System.out.println("\n\nEnter push-ups for each and every day");
		for(int i=0; i<days.length; i++) {
			if(i % 7 == 0) continue;		// Week end
			else days[i] = sc.nextInt();	// Week day
		}
		
		// calculate total push-ups and average
		int count = 0;
		for(int pushUp : days) {
			count += pushUp;
		}
		
		double average = (double)count / (double)days.length;
		
		System.out.format("\nTotal number of push ups : %d and their average is %.1f : \n\n", count, average);
	}
}