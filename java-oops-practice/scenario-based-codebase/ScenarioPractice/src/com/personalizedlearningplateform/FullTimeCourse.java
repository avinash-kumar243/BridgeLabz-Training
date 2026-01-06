package com.personalizedlearningplateform;

public class FullTimeCourse implements ICertifiable {

	@Override
	public String generateCertificate() {
		return "Full couse Certificate have been generated";
	}
}