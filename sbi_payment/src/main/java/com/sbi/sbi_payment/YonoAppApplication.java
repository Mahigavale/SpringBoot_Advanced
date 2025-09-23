package com.sbi.sbi_payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YonoAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(YonoAppApplication.class, args);
		
		
		DoPayment payment=context.getBean(DoPayment.class);
//		System.out.println("**********************");
//		payment.sendmoney();
//		System.out.println("********************************");
		
		payment.paymentdone();
		
	}

}
