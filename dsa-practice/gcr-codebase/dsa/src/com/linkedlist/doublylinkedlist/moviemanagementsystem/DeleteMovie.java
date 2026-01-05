package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class DeleteMovie {
	public static Movie delete(String title, Movie head) {
		if(head == null) {
			System.out.println("LinkedList is empty!!!");
			return null;
		}
		if(head.next == null && head.title.equals(title)) return null;
		if(head.next != null && head.title.equals(title)) {
			head = head.next;
			head.prev = null;
			return head;
		}
		
		Movie temp = head;
		while(temp.next != null && !temp.next.title.equals(title)) {
			temp = temp.next;
		}
		
		Movie current = temp.next.next;
		temp.next = current;
		if(temp.next.next != null) current.prev = temp;
		
		return head;
	}
}