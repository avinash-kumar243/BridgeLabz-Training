package com.fundoonotes.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {
	
	// ConcurrentHashMap → Thread-safe -> Multiple threads can use the blaclistTokenMap at the same time
	private final Map<String, Long> blacklistedTokenMap = new ConcurrentHashMap<>();

	
    // Add token to blacklist
    public void blacklistToken(String token, long expirationTime) {
    		blacklistedTokenMap.put(token, expirationTime);
    }

    // Check whether token is blacklisted or not
    public boolean isBlacklisted(String token) {

        Long expirationTime = blacklistedTokenMap.get(token);

        if(expirationTime == null) {
            return false;
        }

        // Remove expired token from blacklist
        if(expirationTime < System.currentTimeMillis()) {
        		blacklistedTokenMap.remove(token);
            return false;
        } 
        return true;
    }
}