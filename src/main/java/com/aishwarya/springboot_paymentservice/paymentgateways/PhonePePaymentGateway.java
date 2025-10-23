package com.aishwarya.springboot_paymentservice.paymentgateways;

import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PhonePePaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink() throws StripeException {
        return "";
    }
}
