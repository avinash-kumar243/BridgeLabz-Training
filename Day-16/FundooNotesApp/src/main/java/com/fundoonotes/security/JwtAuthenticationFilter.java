package com.fundoonotes.security;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fundoonotes.service.JwtValidationCacheService;
import com.fundoonotes.service.TokenBlacklistService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtValidationCacheService jwtValidationCacheService;
    private final TokenBlacklistService tokenBlacklistService;

    public JwtAuthenticationFilter(JwtValidationCacheService jwtValidationCacheService, TokenBlacklistService tokenBlacklistService) {
        this.jwtValidationCacheService = jwtValidationCacheService;
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

        // Check blacklist FIRST
        if(tokenBlacklistService.isBlacklisted(token)) {

            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

            response.getWriter().write("User is logout");

            return; 
        }

        // Check Redis / Validate JWT
        String userId = jwtValidationCacheService.getUserIdIfValid(token);

        if(userId != null) {

            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(
                            userId,
                            null,
                            Collections.emptyList()
                    );

            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
 
        filterChain.doFilter(request, response);
    }
}