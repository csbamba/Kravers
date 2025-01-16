package com.kravers.service;

import java.util.List;

import com.kravers.model.Notification;
import com.kravers.model.Order;
import com.kravers.model.Restaurant;
import com.kravers.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
