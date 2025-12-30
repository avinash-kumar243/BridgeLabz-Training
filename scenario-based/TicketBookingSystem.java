/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/


import java.util.Scanner;
public class TicketBookingSystem {
	
	static Scanner sc = new Scanner(System.in);
	
	// Method to book a ticket
	public static int ticketBooking(int balance, int price[]) {
		
		System.out.println("\n\nThe Price for each catagory is given below");
		for(int i=0; i<price.length; i++) {
			switch(i) {
				case 0 -> System.out.println("General : " + price[0]);
				case 1 -> System.out.println("Sleeper : " + price[1]);
				case 2 -> System.out.println("AC : " + price[2]);
				case 3 -> System.out.println("Disabled : " + price[3]);
			}
		}
		
		System.out.println("\n\nChoose Catagory");
		System.out.println("1 : General");
		System.out.println("2 : Sleeper");
		System.out.println("3 : AC");
		System.out.println("4 : Disabled");
		
		int choise = sc.nextInt();
		
		// Choosing Catagory
		balance = switch(choise) {
			case 1 -> book("General", balance, price[0]);
			case 2 -> book("Sleeper", balance, price[1]);
			case 3 -> book("AC", balance, price[2]);
			case 4 -> book("Disabled", balance, price[3]);
			default -> {
				System.out.println("Invalid choise! No booking performed");
				yield balance;
			}
		};
		
		return balance;
	}
	
	
	// Final Method to book the ticket
	public static int book(String catagory, int balance, int price) {
		System.out.print("\nPlease enter Source : ");
		String source = sc.next();
		
		System.out.print("Please enter Destination : ");
		String destination = sc.next();
		
		
		System.out.print("Please enter seat allocation either Upper, or lower, or middle : ");
		String seat = sc.next();
		
		System.out.print("Please enter Your name : ");
		String name = sc.next();
		System.out.print("Please enter Your age : ");
		String age = sc.next();
		
		System.out.print("\nIf you are sure to book the ticket then Press 1, or for canclation Press any other keyword : ");
		int conformBook = sc.nextInt();
		
		if(conformBook == 1) {
			while(price > balance) {
				System.out.println("\nInsufficient balance!!! \nPlease enter amount");
				balance += addBalance();
			}
			if(price <= balance) {
				System.out.println("\nCongratulations! Your Ticket has been booked.");
				balance -= price;
			}
		} else {
			System.out.println("\nTicket Booking cancled.\n\n");
		}
		
		System.out.println("\n-----------------------------------------------------------------\n");
		return balance;
	}
	
	public static int addBalance() {
		System.out.println("Enter amount to add : ");
		int amount = sc.nextInt();
		return amount;
	}
	
	// main method
	public static void main(String args[]) {
		System.out.println("----------------------------------------------------");
		System.out.println("--------------- Train Reservation System ---------------");
		System.out.println("----------------------------------------------------\n");
		
		int seats = 2;
		int balance = 10000;
		
		int price[] = {200, 500, 1000, 100};
		
		// Ticket is available to book untill seats are full
		while(seats != 0) {
			if(seats > 0) System.out.println("\n" + seats + " seats available");
			balance = ticketBooking(balance, price);
			seats--;
		}
		System.out.println("\nSorry! No seat available");
	}
}