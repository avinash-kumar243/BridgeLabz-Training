package com.quicksort.eventmanager;

public class Ticket {
	private String ticketId;
	private int price;
	
	public Ticket(String ticketId, int price) {
		this.ticketId = ticketId;
		this.price = price;
	}

	
	// Getters and Setters
	public String getTicketId() {
		return ticketId;
	}
	public int getPrice() {
		return price;
	}	
	
	
	@Override
	public String toString() {
		return "Ticket id: " + ticketId + " || Ticket price: " + price; 
	}
}