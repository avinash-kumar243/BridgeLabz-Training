package com.lambdaexpressions.hospitalpatient;

import java.util.Arrays;
import java.util.List;

public class HospitalMain {
	public static void main(String[] args) {
		List<Patient> patients = Arrays.asList(new Patient("101", "Avi"),
											   new Patient("102", "Deepak"),
											   new Patient("103", "Sonu"),
											   new Patient("104", "Rani"),
											   new Patient("105", "Komal"),
											   new Patient("106", "Krishna"));
		
		System.out.println("All patients ids are: ");
		patients.stream()
				.map(Patient::getPatientId)
				.forEach(System.out::println);
	}
}