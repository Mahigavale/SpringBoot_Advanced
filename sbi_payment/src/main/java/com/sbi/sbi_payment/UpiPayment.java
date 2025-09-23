package com.sbi.sbi_payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPayment implements IPayment {

	@Override
	public String sendmoney() {
		
		System.out.println("Money sent by UPI");
		return "UPI_PAYMENT_SENT";
	}

	@Override
	public String getmoney() {
		System.out.println("Money recieved via UPI");
		return "UPI_PAYMENT_RECIEVED";
	}

}
