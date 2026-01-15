package com.bubblesort.hospitalqueue;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	List<Patient> patientList = new ArrayList<>();

	
	public void addPatient(Patient patient) {		
		patientList.add(patient);
		System.out.println("Patient added");
	}
	
	public void removePatient(int id) {
		if(id <= 0) {
			System.out.println("Invalid id");
			return;
		}
		
		for(Patient patient : patientList) {
			if(patient.getId() == id) {
				patientList.remove(patient);
				System.out.println("Patient have been removed");
				return;
			}
		}
		System.out.println("Patient not found");
	}	

	public void sortPatient() {
		int n = patientList.size();
		
		// bubble sort
		for(int i=0; i<n-1; i++) {
			boolean isSwap = false;
			
			for(int j=0; j<n-1-i; j++) {
				if(patientList.get(j).getCriticalLevel() > patientList.get(j+1).getCriticalLevel()) {
					// Swapping
					
					Patient currPatient = patientList.get(j);
					patientList.set(j, patientList.get(j+1));
					patientList.set(j+1, currPatient);
					isSwap = true;
				}
			}
			if(!isSwap) {
				break;
			}
		}
		System.out.println("\nPatients have been sorted successfully\n");
	}	
	
	public void showAllPatient() {
		if(patientList.isEmpty()) {
			System.out.println("Patients list is empty");
			return; 
		}
		
		int count = 1;
		for(Patient patient : patientList) {
			System.out.print("Patient " + count + " details ->  ");
			System.out.print(" Id: " + patient.getId());
			System.out.println(", Critical level: " + patient.getCriticalLevel());
			count++;
		}
	}
}