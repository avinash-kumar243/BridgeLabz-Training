package com.interfaces.queue;

import java.util.Collections;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{
	private String name;
	private int severity;
	
	public Patient(String name, int severity) {
		this.name = name;
		this.severity = severity;
	}

	public String getName() {
		return name;
	}
	public int getSeverity() {
		return severity;
	}
	
	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.severity, other.severity); 
	}
}
public class HospitalSystem {
	public static void main(String[] args) {
		PriorityQueue<Patient> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.offer(new Patient("John", 3));
		pq.offer(new Patient("Alice", 2));
		pq.offer(new Patient("Bob", 1));
		pq.offer(new Patient("Akshay", 4));
	  		
		System.out.println("\nPatients are sorted by their severity level: \n");
		
		while(!pq.isEmpty()) {
			Patient patient = pq.poll();
			System.out.println("Name: " + patient.getName() + ", severity: " + patient.getSeverity());
		}
	}
}