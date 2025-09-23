package com.sbi.sbi_payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CashPayment implements IPayment {

	@Override
	public String sendmoney() {
		
		System.out.println("Money sent via cash..");
		return "CASH-SENT";
	}

	@Override
	public String getmoney() {
		
		System.out.println("Money recieved via cash...");
		return "CASH_RECIEVED";
	}

}
