package com.sbi.sbi_payment;

import org.springframework.stereotype.Component;

@Component
public interface IPayment {

	
	public String sendmoney();
	
	public String getmoney();
}
