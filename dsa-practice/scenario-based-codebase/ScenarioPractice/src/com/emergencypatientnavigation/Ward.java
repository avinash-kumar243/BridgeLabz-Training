package com.emergencypatientnavigation;

public class Ward {
	private String wardName;
	Ward next;
	
	public Ward(String wardName) {
		this.wardName = wardName;
		this.next = null;
	}

	
	// Getters and Setters
	public String getWardName() {
		return wardName;
	}
	public void setWardName(String wardName) {
		this.wardName = wardName;
	}
}