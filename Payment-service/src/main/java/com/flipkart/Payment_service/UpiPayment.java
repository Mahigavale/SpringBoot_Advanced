package com.flipkart.Payment_service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPayment implements PaymentService {

	@Override
	public void makepayment() {
	System.out.println("This Payment is made from the UPI :::::");

	}

}
