package com.practice.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(DuplicateEmailFoundException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateContact(DuplicateEmailFoundException e, HttpServletRequest request) {
	
		ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                HttpStatus.NOT_FOUND.value(),
                e.getMessage(),
                request.getRequestURI()
        );
		  
		return ResponseEntity 
	                .status(HttpStatus.NOT_FOUND)
	                .body(response);
	}
	
//	
//	@ExceptionHandler(ContactNotFoundException.class)
//	public ResponseEntity<ErrorResponse> handleContactNotFound() {
//		
//		ErrorResponse response = new ErrorResponse(
//				LocalDateTime.now(), );
//	}
	
}	