package com.kravers.service;

import com.stripe.exception.StripeException;
import com.kravers.model.Order;
import com.kravers.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
