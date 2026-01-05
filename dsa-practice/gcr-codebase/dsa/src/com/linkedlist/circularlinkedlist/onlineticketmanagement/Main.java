package com.linkedlist.circularlinkedlist.onlineticketmanagement;

public class Main {
    public static void main(String[] args) {

        TicketCircularList list = new TicketCircularList();

        list.addTicket(101, "Rahul", "Avengers", "A1", "10:30 AM");
        list.addTicket(102, "Meena", "Avatar", "B2", "01:00 PM");
        list.addTicket(103, "Amit", "Inception", "C3", "03:15 PM");

        list.displayTickets();

        System.out.println("\nSearching ticket by movie name:");
        list.searchTicket("Avatar");

        System.out.println("\nRemoving Ticket ID = 102");
        list.removeTicket(102);

        list.displayTickets();

        System.out.println("\nTotal Tickets Booked: " + list.countTickets());
    }
}
