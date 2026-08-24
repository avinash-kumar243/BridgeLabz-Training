package com.fundoonotes.security;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomUserDetails implements UserDetails {
	
    private final int userId;
    private final String email;
    private final String password;
    
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Collections.emptyList(); 
	}
	
	@Override
	public String getPassword() {
		return password; 
	}
	
	@Override
	public String getUsername() {
		return email; 
	}
	
}