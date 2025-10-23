package com.aishwarya.springboot_paymentservice.paymentgateways;

import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

// Adapter Design Pattern
@Service
public class RazorPayPaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink() throws StripeException {
        return null;
    }
}
