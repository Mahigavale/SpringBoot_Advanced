package com.sbi.sbi_payment;

import org.springframework.stereotype.Component;

@Component("order")
public class MoneyOrder implements IPayment {

	@Override
	public String sendmoney() {
	System.out.println("Money sent by the post card i.e. moneyorder");
		return null;
	}

	@Override
	public String getmoney() {
		System.out.println("Money order recieved....");
		return null;
	}

}
