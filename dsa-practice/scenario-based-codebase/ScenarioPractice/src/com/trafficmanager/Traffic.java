package com.trafficmanager;

public class Traffic {
	Vehicle head;
	Vehicle curr;
	
	
	// Add Car
	public void addCar(Vehicle car) {
		
		// Case 1 : No car present
		if(head == null) {
			head = curr = car;
			head.next = head;
			System.out.println("Car is added");
			return;
		}
		
		// case 2 : Car present
		curr.next = car;
		curr = car;
		car.next = head;
		System.out.println("Car is added");
	}
	
	
	// Remove Car
	public void removeCar(String carNumber) {
		// case 1 : - No car present
		if(head == null) {
			System.out.println("Car not found");
			return;
		}
		
		// case 2 :- Single Car present
		if(head == head.next && head.getVehicleNumber().equalsIgnoreCase(carNumber)) {
			head = curr = null;
			System.out.println("Car not found");
			return;
		}
		
		// multiple car present
		Vehicle justCurr = head;
		Vehicle prev = null;
		do {
			
			// remove head car
			if(justCurr.getVehicleNumber().equalsIgnoreCase(carNumber)) {
				Vehicle end = justCurr;
				if(head==end) {
					while(end.next!=head) {
						end = justCurr.next;
					}
					head = head.next;
					end.next = head;
				}
				else {
					prev.next = justCurr.next;
				}
				System.out.println("Car no " + carNumber + " has been removed");
				return;
			}			
			
			prev = justCurr;
			justCurr = justCurr.next;
						
		} while(head != justCurr);
		
		System.out.println("\nCar not found!");
		return;
	}
	
	
	// Print Car Details
	public void printCarDetails() {
		Vehicle temp = head;
		int count = 1;
		
		if(temp == null) {
			System.out.println("No Car present");
			return;
		}
		System.out.println();
		while(temp.next != head) {
			System.out.print("Car " + count + " details are :-  ");
			System.out.println("Car number: "  + temp.vehicleNumber + " -> position: " + count); 
			count++;
			temp = temp.next;
		}
		System.out.print("Car " + count + " details are :-  ");
		System.out.println("Car number: "  + temp.vehicleNumber + " -> position: " + count); 
	}
}