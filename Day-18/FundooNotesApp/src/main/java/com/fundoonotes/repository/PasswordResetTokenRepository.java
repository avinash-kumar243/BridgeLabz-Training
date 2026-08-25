package com.fundoonotes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundoonotes.model.PasswordResetToken;
import com.fundoonotes.model.User;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
 
	Optional<PasswordResetToken> findByResetToken(String resetToken);

    void deleteByUser(User user);
} 