package com.aishwarya.springboot_paymentservice.services;

import com.aishwarya.springboot_paymentservice.paymentgateways.PaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentServiceImpl(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public String generatePaymentLink(Long orderId) throws StripeException {

        // Make a call to OrderService to get the order details for the given orderId
        // List of products and the price and quantity of each product
        // iPhone 17 pro max - 1
        // airpods - 1
        // Watch 3 ultra - 1

        // Make a call to Payment Gateway and generate the payment link
        // Use Adapter pattern; Stripe Payment Gateway should not be called directly
        // Stripe

        return paymentGateway.generatePaymentLink();
    }
}
