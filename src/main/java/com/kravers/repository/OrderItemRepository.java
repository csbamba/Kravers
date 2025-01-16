package com.kravers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kravers.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
