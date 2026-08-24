package com.fundoonotes.service;

import java.time.Duration;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.fundoonotes.security.JwtUtil;

@Service
public class JwtValidationCacheService {

    private static final String CACHE_PREFIX = "jwt:valid:";

    private final StringRedisTemplate redisTemplate;
    private final JwtUtil jwtUtil;

    public JwtValidationCacheService(StringRedisTemplate redisTemplate, JwtUtil jwtUtil) {
        this.redisTemplate = redisTemplate;
        this.jwtUtil = jwtUtil;
    }
    

    public String getUserIdIfValid(String token) {

        String cacheKey = CACHE_PREFIX + token;

        // Check Redis first
        String cachedUserId = redisTemplate.opsForValue().get(cacheKey);

        if(cachedUserId != null) {
            System.out.println("Jwt Cache Hit");
            return cachedUserId;
        }

        System.out.println("Jwt Cache Miss - Performing JWT validation");

        // Real JWT validation
        try {
            String userId = jwtUtil.extractUserId(token);

            // Calculate remaining JWT lifetime
            long expirationTime = jwtUtil.extractExpiration(token);

            long remainingTime = expirationTime - System.currentTimeMillis();

            if(remainingTime <= 0) {
                return null;
            }

            // Cache only until JWT expires
            redisTemplate.opsForValue().set( 
                    cacheKey,
                    userId,
                    Duration.ofMillis(remainingTime)
            );

            System.out.println("JWT validation result cached");
            return userId;

        } catch(Exception e) {
            System.out.println("JWT validation failed");
            return null;
        }
    }
}