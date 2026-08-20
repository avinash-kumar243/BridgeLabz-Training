package com.fundoonotes.service;

import com.fundoonotes.dto.ForgotPasswordRequestDto;
import com.fundoonotes.dto.LoginRequestDto;
import com.fundoonotes.dto.RegisterRequestDto;
import com.fundoonotes.dto.ResetPasswordRequestDto;

public interface IUserService {
	
	String register(RegisterRequestDto request);
	
	String login(LoginRequestDto request);
	
	void logout(String token);
	
	String forgotPassword(ForgotPasswordRequestDto request);
 
	void resetPassword(ResetPasswordRequestDto request);
}