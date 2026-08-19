package com.fundoonotes.service;

import com.fundoonotes.dto.LoginRequestDto;
import com.fundoonotes.dto.RegisterRequestDto;

public interface IUserService {
	
	String register(RegisterRequestDto request);
	String login(LoginRequestDto request);
}