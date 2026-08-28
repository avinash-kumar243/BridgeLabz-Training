package com.fundoonotes.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fundoonotes.service.JwtValidationCacheService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtValidationCacheService jwtValidationCacheService;
    private final JwtUtil jwtUtil;

    public JwtAuthenticationFilter(JwtValidationCacheService jwtValidationCacheService, JwtUtil jwtUtil) {
        this.jwtValidationCacheService = jwtValidationCacheService;
        this.jwtUtil = jwtUtil;
    }

    
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");

        // No JWT → continue
        // Spring Security will decide whether this endpoint is public or protected
        if(authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }

        String token = authorizationHeader.substring(7);

        
        // Check Redis / validate JWT

        String userId = jwtValidationCacheService.getUserIdIfValid(token);

        if(userId == null) {

            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            response.getWriter().write("Invalid or expired token");

            return;
        }

        
        // Create Authentication
        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(
                        userId,
                        null,
                        Collections.emptyList()
                );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        // Logout
        if("POST".equalsIgnoreCase(request.getMethod()) && "/auth/logout".equals(request.getRequestURI())) {

            long expirationTime = jwtUtil.extractExpiration(token);
        }

        // Continue request
        filterChain.doFilter(request, response);
    }
}