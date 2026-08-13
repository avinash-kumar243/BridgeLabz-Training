package com.practice.exception;

public class DuplicateEmailFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DuplicateEmailFoundException(String message) {
		super(message);
	}
}