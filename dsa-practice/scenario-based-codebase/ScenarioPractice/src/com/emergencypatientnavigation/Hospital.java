package com.emergencypatientnavigation;

public class Hospital {
	private Ward head;
	private Ward maintainanceWardHead;
	
	// Adding ward at initial stage
	public void addWard(String wardName) {
		Ward newWard= new Ward(wardName);
		
		if(head == null) {
			head = newWard;
			head.next = head;
			return;
		}
		
		Ward temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = newWard;
		newWard.next = head;
	}
	
	
	// Send ward for maintenance
	public void goForMaintenance(String wardName) {
		if (head == null) {
			System.out.println("No wards available");
			return;
		}

		Ward curr = head;
		Ward prev = null;

		do {
			if(curr.getWardName().equalsIgnoreCase(wardName)) {

				// If only one ward
				if(curr == head && head.next == head) {
					head = null;
				}
				// If removing head
				else if(curr == head) {
					Ward tail = head;
					while(tail.next != head) {
						tail = tail.next;
					}
					head = head.next;
					tail.next = head;
				}
				// Removing middle or last ward
				else {
					prev.next = curr.next;
				}

				// Push to maintenance stack
				curr.next = maintainanceWardHead;
				maintainanceWardHead = curr;

				System.out.println(wardName + " sent for maintenance");
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);
		System.out.println("Ward not found");
	}

	// -------- RETRIEVE WARD FROM MAINTENANCE --------
	public void retrieveFromMaintenance() {
		if(maintainanceWardHead == null) {
			System.out.println("No wards under maintenance");
			return;
		}

		Ward ward = maintainanceWardHead;
		maintainanceWardHead = maintainanceWardHead.next;

		addWard(ward.getWardName());
		System.out.println(ward.getWardName() + " restored from maintenance");
	}
}