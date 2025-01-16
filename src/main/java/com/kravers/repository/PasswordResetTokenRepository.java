package com.kravers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kravers.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
