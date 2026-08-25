package com.fundoonotes.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice  // @ControllerAdvice & @ResponseBody
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NoteNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleNoteNotFound(NoteNotFoundException e, HttpServletRequest requesst) {
		
		ErrorResponse response = new ErrorResponse();
		response.setError("Not Found");
		response.setMessage(e.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setTimestamp(LocalDateTime.now());
		response.setPath(requesst.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response); 
	}
	
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException e, HttpServletRequest request) {
		
		ErrorResponse response = new ErrorResponse();
		response.setError("Not Found");
		response.setMessage(e.getMessage());
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setTimestamp(LocalDateTime.now());
		response.setPath(request.getRequestURI());  
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response); 
	}
	
	
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateEmail(DuplicateEmailException e, HttpServletRequest request) {
		
		ErrorResponse response = new ErrorResponse();
		response.setMessage(e.getMessage());
		response.setStatus(HttpStatus.CONFLICT.value());  // 409 - Conflict
		response.setTimestamp(LocalDateTime.now());
		response.setError("Conflict");
		response.setPath(request.getRequestURI()); 
		
		return ResponseEntity.status(HttpStatus.CONFLICT).body(response); 
	} 
	
}