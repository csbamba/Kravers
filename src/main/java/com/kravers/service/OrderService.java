package com.kravers.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.kravers.Exception.CartException;
import com.kravers.Exception.OrderException;
import com.kravers.Exception.RestaurantException;
import com.kravers.Exception.UserException;
import com.kravers.model.Order;
import com.kravers.model.PaymentResponse;
import com.kravers.model.User;
import com.kravers.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
