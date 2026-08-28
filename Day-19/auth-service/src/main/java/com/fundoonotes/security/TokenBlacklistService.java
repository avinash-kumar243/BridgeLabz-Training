package com.fundoonotes.security;

import java.time.Duration;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {

    private static final String BLACKLIST_PREFIX = "jwt:blacklist:";

    private final StringRedisTemplate redisTemplate;

    public TokenBlacklistService(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate; 
    }

    
    public void blacklistToken(String token, long expirationTime) {

        long currentTime = System.currentTimeMillis();

        long remainingTime = expirationTime - currentTime;

        // Token has already expired
        if(remainingTime <= 0) {
            return;
        }

        String key = BLACKLIST_PREFIX + token;

        redisTemplate.opsForValue().set(
                key,
                "blacklisted",
                Duration.ofMillis(remainingTime)
        );
    }

     
    public boolean isBlacklisted(String token) {

        String key = BLACKLIST_PREFIX + token;

        return Boolean.TRUE.equals(redisTemplate.hasKey(key));
    }
}