package com.streamapi.hospitaldoctoravailability;

import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Doctor> doctors = List.of(new Doctor("DR. Avi", "Cardiology", true),
									   new Doctor("DR. Bittu", "Neurology", true),
									   new Doctor("DR. Komal", "Orthology", false),
									   new Doctor("DR. Rahul", "Cardiology", true),
									   new Doctor("DR. Deepika", "Dermatology", false),
									   new Doctor("DR. Sonali", "Orthology", true));
		
		
		System.out.println("Doctors who are available on weekends are :- ");
		doctors.stream()
			   .filter(doctor -> doctor.isAvailableOnWeekend())
			   .sorted(Comparator.comparing(Doctor::getSpeciality))
			   .forEach(doctor -> System.out.println(doctor));
	}
}