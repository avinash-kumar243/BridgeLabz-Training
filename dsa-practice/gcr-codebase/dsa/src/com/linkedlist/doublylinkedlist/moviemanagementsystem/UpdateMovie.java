package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class UpdateMovie {
	public static Movie update(String title, String newTitle, Movie head) {
		
		if(head == null) return null;
		
		Movie temp = head;
		while(temp != null && !temp.title.equals(title)) {
			temp = temp.next;
		}
		
		if(temp != null) temp.title = newTitle;
		return head;
	}
}