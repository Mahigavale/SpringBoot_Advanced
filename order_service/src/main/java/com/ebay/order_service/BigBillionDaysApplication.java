package com.ebay.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ebay.order_service.components.Order;

@SpringBootApplication
public class BigBillionDaysApplication {

	public static void main(String[] args) {
	ApplicationContext	 con=SpringApplication.run(BigBillionDaysApplication.class, args);
		
	    System.out.println("The application has started.......");
		
		
		System.out.println("*****************************************");
		
		
//		
//		Order order1=con.getBean(Order.class);
//		
//		Order order2=con.getBean(Order.class);
//		
//		System.out.println(order1.hashCode()==order2.hashCode());
//		
//		System.out.println("Counter:"+order1.counter);
	}

}
