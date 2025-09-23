package com.sbi.sbi_payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DoPayment {

	
	@Autowired
	@Qualifier("upi")
	 IPayment payment;
	
	public void paymentdone()
	{
		
		payment.sendmoney();
		payment.getmoney();
		System.out.println("Payment done>>>>>>");
	}
}
