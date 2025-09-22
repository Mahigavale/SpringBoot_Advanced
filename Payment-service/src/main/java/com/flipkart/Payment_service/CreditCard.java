package com.flipkart.Payment_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCard implements PaymentService {

	@Override
	public void makepayment() {
	System.out.println("This is the payment made from the creditcard.....");

	}

}
