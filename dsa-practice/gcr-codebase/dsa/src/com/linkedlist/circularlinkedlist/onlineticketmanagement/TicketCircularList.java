package com.linkedlist.circularlinkedlist.onlineticketmanagement;

public class TicketCircularList {

    private TicketNode head = null;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = newNode;
            newNode.next = head; // circular link
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by Ticket ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TicketNode current = head;
        TicketNode prev = null;

        // Case 1: Only one ticket
        if (head.ticketId == id && head.next == head) {
            head = null;
            System.out.println("Ticket removed successfully.");
            return;
        }

        // Case 2: Removing head ticket
        if (head.ticketId == id) {
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
            System.out.println("Ticket removed successfully.");
            return;
        }

        // Case 3: Removing middle or last ticket
        current = head;
        while (current.next != head) {
            if (current.ticketId == id) {
                prev.next = current.next;
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        }

        // Check last node
        if (current.ticketId == id) {
            prev.next = head;
            System.out.println("Ticket removed successfully.");
        } else {
            System.out.println("Ticket ID not found.");
        }
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\nCurrent Ticket Reservations:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                               ", Customer: " + temp.customerName +
                               ", Movie: " + temp.movieName +
                               ", Seat: " + temp.seatNumber +
                               ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket by Customer Name or Movie Name
    public void searchTicket(String key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {

                System.out.println("Match Found -> Ticket ID: " + temp.ticketId +
                                   ", Customer: " + temp.customerName +
                                   ", Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for searched value.");
        }
    }

    // Count total booked tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
