package com.quicksort.eventmanager;

import java.util.Scanner;

public class EventManager {
	public static void main(String[] args) {
		TicketManager ticketManager = new TicketManager();
		
		
		while(true) {
			System.out.println("\nEnter 1 to view all tickets");
			System.out.println("Enter 2 to add a ticket");
			System.out.println("Enter 3 to sort all tickets");
			System.out.println("Enter 4 to exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			String ticketId;
			int price;
			
			switch(choice) {
				case 1:
					ticketManager.viewTickets();
					break;
					
				case 2:
					System.out.println("Enter ticket id: ");
					ticketId = sc.next();
					System.out.println("Enter ticket price: ");
					price = sc.nextInt();
					
					ticketManager.addTicket(ticketId, price);
					break;
					
				case 3:
					ticketManager.sortTickets();
					break;
					
				case 4:
					System.out.println("Use me again");
					return;
					
				default:
					System.out.println("Invalid choice!!!"); 
			}
		}
	}
}