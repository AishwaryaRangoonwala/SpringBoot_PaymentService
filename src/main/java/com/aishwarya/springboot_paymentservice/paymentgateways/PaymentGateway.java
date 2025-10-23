package com.aishwarya.springboot_paymentservice.paymentgateways;

import com.stripe.exception.StripeException;

// Adapter Design Pattern
public interface PaymentGateway {
    String generatePaymentLink() throws StripeException;
}
