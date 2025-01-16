package com.kravers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kravers.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
