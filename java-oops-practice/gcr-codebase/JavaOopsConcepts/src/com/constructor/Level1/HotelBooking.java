package com.constructor.Level1;

public class HotelBooking {
	private String guestName;
	private String roomType;
	private int nights;
	
	// Default Constructor
	public HotelBooking() {
		guestName = "Deepanshu";
		roomType = "Standard";
		nights = 2;
	}
	
	// Parameterized Constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// Copy Constructor
	public HotelBooking(HotelBooking hotel) {
		this.guestName = hotel.guestName;
		this.roomType = hotel.roomType;
		this.nights = hotel.nights;
	}
	
	void displayBookedHotel() {
		System.out.println("\nName : " + guestName + "\nRoomType : " + roomType + "\nnights : " + nights);
	}
}