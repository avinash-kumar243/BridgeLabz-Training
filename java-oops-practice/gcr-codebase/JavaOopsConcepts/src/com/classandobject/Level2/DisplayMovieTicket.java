package com.classandobject.Level2;

public class DisplayMovieTicket {
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket("Dragon");
		
		//calling the method
		ticket.displayTicket();
		ticket.bookTicket("A10",120.0);
		ticket.bookTicket("B10", 120.0);
		ticket.bookTicket("A11", 120.0); //booking the ticket which is already booked
		ticket.displayTicket();
	}
}