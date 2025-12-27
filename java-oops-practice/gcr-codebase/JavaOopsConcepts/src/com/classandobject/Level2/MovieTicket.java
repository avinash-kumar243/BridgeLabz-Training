package com.classandobject.Level2;

public class MovieTicket {
	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;

	//Creating the constructor
	MovieTicket(String movieName){
		this.movieName = movieName;
		this.seatNumber = "Null";
		this.price = 0.0 ;
		this.isBooked = false;
	}
	
	public void bookTicket(String seatNumber, double price) {
		if(!isBooked) {
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked = true;
			
			System.out.println("Ticket Booked for movie name : " + this.movieName);
			System.out.println("Set number is : " + this.seatNumber);
			System.out.println("Price : $" + this.price);
		} else {
			System.out.println("House full!!! sorry..... Ticket already booked");
		}
	}
	
	public void displayTicket() {
		//checking whether the ticket is already booked
		if(this.isBooked) {
			System.out.println("Ticket booked for movie: " + this.movieName);
           System.out.println("Seat Number: " + this.seatNumber);
           System.out.println("Price: $" + this.price);	
		}
		//displaying message If failed to book the ticket
		else {
			System.out.println("Ticket have not booked yet....");
		}
	}
}