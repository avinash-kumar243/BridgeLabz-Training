package com.fundoonotes.service;

import com.fundoonotes.dto.request.ForgotPasswordRequestDto;
import com.fundoonotes.dto.request.LoginRequestDto;
import com.fundoonotes.dto.request.RegisterRequestDto;
import com.fundoonotes.dto.request.ResetPasswordRequestDto;

public interface IUserService {
	
	String register(RegisterRequestDto request);
	
	String login(LoginRequestDto request);
	
	void logout(String token);
	
	String forgotPassword(ForgotPasswordRequestDto request);
 
	void resetPassword(ResetPasswordRequestDto request);
}