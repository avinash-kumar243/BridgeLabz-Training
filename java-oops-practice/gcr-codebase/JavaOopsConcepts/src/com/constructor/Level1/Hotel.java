package com.constructor.Level1;

public class Hotel {
	public static void main(String[] args) {
		HotelBooking hotel1 = new HotelBooking();
		HotelBooking hotel2 = new HotelBooking("Kavya", "Delux", 1);
		HotelBooking hotel3 = new HotelBooking(hotel2);
		
		hotel1.displayBookedHotel();
		hotel2.displayBookedHotel();
		hotel3.displayBookedHotel();
	}
}