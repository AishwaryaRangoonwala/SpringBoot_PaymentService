package com.aishwarya.springboot_paymentservice.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(Long orderId) throws StripeException;
}
