package com.fundoonotes.security;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fundoonotes.service.TokenBlacklistService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final TokenBlacklistService tokenBlacklistService;

    // Constructor Injection
    public JwtAuthenticationFilter(JwtUtil jwtUtil, TokenBlacklistService tokenBlacklistService) {
        this.jwtUtil = jwtUtil;
        this.tokenBlacklistService = tokenBlacklistService;
    }

    
    @Override 
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String authorizationHeader = request.getHeader("Authorization");

        // Check Authorization header
        if(authorizationHeader == null || !authorizationHeader.startsWith("Bearer ")) {
        	
            filterChain.doFilter(request, response);
        
            return;
        }

        // Extract JWT
        String token = authorizationHeader.substring(7);

        // Check blacklist
        if(tokenBlacklistService.isBlacklisted(token)) {
        	
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            response.getWriter().write("Token has been logged out");

            return;
        }

        // Validate JWT
        if(jwtUtil.isTokenValid(token)) {

            String userId = jwtUtil.extractUserId(token);

            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(
                            userId,
                            null,
                            null
                    );

            SecurityContextHolder.getContext().setAuthentication(authentication); 
        }

        filterChain.doFilter(request, response);
    }
}