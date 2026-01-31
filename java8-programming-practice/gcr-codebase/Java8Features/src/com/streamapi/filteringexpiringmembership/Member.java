package com.streamapi.filteringexpiringmembership;

import java.time.LocalDate;

public class Member {
	private String id;
	private LocalDate expiry;
	
	public Member(String id, LocalDate expiry) {
		this.id = id;
		this.expiry = expiry;
	}

	public String getId() {
		return id;
	}
	public LocalDate getExpiry() {
		return expiry;
	}

	@Override
	public String toString() {
		return "Member [id: " + id + ", expiry: " + expiry + "]";
	}
}