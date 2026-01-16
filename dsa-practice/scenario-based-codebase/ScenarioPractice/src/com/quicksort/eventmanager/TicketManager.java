package com.quicksort.eventmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TicketManager {
	List<Ticket> allTickets = new ArrayList<>();
	
	
	// Add ticket
	public void addTicket(String ticketId, int price) {
		Ticket newTicket = new Ticket(ticketId, price);
		allTickets.add(newTicket); 
		System.out.println("Ticket have been added");
	}
	
	// Sort all tickets - Quick Sort
	public void sortTickets() {
		int st = 0, end = allTickets.size()-1;
		
		quickSort(st, end);
		
		System.out.println("Tickets have been sorted");
	}
	private void quickSort(int st, int end) {
		if(st < end) {
			int pi = partition(st, end);
			
			quickSort(st, pi-1);
			quickSort(pi+1, end);
		}
	}
	private int partition(int st, int end) {
		int i=st-1;
		
		for(int j=st; j<end; j++) {
			if(allTickets.get(j).getPrice() < allTickets.get(end).getPrice()) {
				i++;
				Ticket temp = allTickets.get(i);
				allTickets.set(i, allTickets.get(j));
				allTickets.set(j, temp);
			}
		}
		
		// Place end element at its correct position
		i++;
		Ticket temp = allTickets.get(i);
		allTickets.set(i, allTickets.get(end));
		allTickets.set(end, temp); 
		
		return i;
	}

	// View All tickets
	public void viewTickets() {
		if(allTickets.isEmpty()) {
			System.out.println("No available ticket");
			return; 
		}
		
		System.out.println("\nAll ticket details are: ");
		for(Ticket ticket : allTickets) {
			System.out.println(ticket);	
		}
	}
}