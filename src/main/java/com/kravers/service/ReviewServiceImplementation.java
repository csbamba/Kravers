package com.kravers.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kravers.Exception.ReviewException;
import com.kravers.model.Restaurant;
import com.kravers.model.Review;
import com.kravers.model.User;
import com.kravers.repository.RestaurantRepository;
import com.kravers.repository.ReviewRepository;
import com.kravers.request.ReviewRequest;
@Service
public class ReviewServiceImplementation implements ReviewSerive {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

   @Override
    public Review submitReview(ReviewRequest reviewRequest, User user) {
        Review review = new Review();
        System.out.println(reviewRequest);
        
        System.out.println(reviewRequest.getRestaurantId());
         Optional<Restaurant> restaurant = restaurantRepository.findById(reviewRequest.getRestaurantId());
         if(restaurant.isPresent()) {
        	 review.setRestaurant(restaurant.get());
         }
        review.setCustomer(user);
        review.setMessage(reviewRequest.getReviewText());
        review.setRating(reviewRequest.getRating());
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    
    @Override
    public void deleteReview(Long reviewId) throws ReviewException {
        Optional<Review> optionalReview = reviewRepository.findById(reviewId);

        if (optionalReview.isPresent()) {
            reviewRepository.deleteById(reviewId);
        } else {
            throw new ReviewException("Review with ID " + reviewId + " not found");
        }
    }

    @Override
    public double calculateAverageRating(List<Review> reviews) {
    	 double totalRating = 0;

         for (Review review : reviews) {
             totalRating += review.getRating();
         }

         if (reviews.size() > 0) {
             return totalRating / reviews.size();
         } else {
             return 0;
         }
    }
}

