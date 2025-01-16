package com.kravers.service;

import java.util.List;

import com.kravers.Exception.ReviewException;
import com.kravers.model.Review;
import com.kravers.model.User;
import com.kravers.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
