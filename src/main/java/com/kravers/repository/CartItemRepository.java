package com.kravers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kravers.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
