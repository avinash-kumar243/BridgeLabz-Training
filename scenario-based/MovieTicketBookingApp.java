/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/


import java.util.Scanner;
public class MovieTicketBookingApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		System.out.println("\n-------------------------------------------------------");
		System.out.println("-------------- Movie Ticket Booking App ---------------");
		System.out.println("-------------------------------------------------------\n");		
		
		while(true) {
			System.out.println("\nEnter movie type");
			System.out.println("1 : Action Movie");
			System.out.println("2 : Comedy Movie");
			System.out.println("3 : Horror Movie");
			int movieType = sc.nextInt();
			
			while(movieType <= 0 || movieType > 3) {
				System.out.println("Please enter valid options : ");
				movieType = sc.nextInt();
			}
			
			System.out.println("\nEnter seat type");
			System.out.println("1 : Gold type seat");
			System.out.println("2 : Silver type seat");
			int seatType = sc.nextInt();
			
			while(seatType <= 0 || seatType > 2) {
				System.out.println("Please enter valid options : ");
				seatType = sc.nextInt();
			}
			
			System.out.println("\nEnter snacks");
			System.out.println("1 : Popcorn");
			System.out.println("2 : Candy");
			System.out.println("3 : Soft Drinks\n");
			int snacksType = sc.nextInt();
			
			while(snacksType <= 0 || snacksType > 3) {
				System.out.println("Please enter valid options : ");
				snacksType = sc.nextInt();
			}
			
			System.out.println("\n");

			String movie = switch(movieType) {
				case 1 -> "Action movie";
				case 2 -> "Comedy movie";
				case 3 -> "Horror movie";
				default -> "Unknown";
			};
			
			String seat = seatType == 1 ? "Gold" : "Silver";
			
			String snacks = switch(snacksType) {
				case 1 -> "Popcorn";
				case 2 -> "Candy";
				default -> "Soft Drinks";
			};
			
			System.out.println("Movie ticket has been booked for - " + movie + ", seatType is - " + seat + " and snacks is - " + snacks); 
			
			System.out.println("\nDo you want to terminate program. Tell yes or no");
			String option = sc.next();
			
			System.out.println("\n--------------------------------------------------------------------------------------------------\n");
			
			if(option.equals("Yes") || option.equals("YES") || option.equals("yes")) System.exit(0);
		}
	}
}