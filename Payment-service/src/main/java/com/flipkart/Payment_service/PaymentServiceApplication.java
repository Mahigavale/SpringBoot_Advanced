package com.flipkart.Payment_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(PaymentServiceApplication.class, args);
	
		
		
	
	         Animal animal= context.getBean(Animal.class);
	          Plants plants=context.getBean(Plants.class);
	          
	          DoPayment payment=context.getBean(DoPayment.class);
	          
	          payment.DoTransaction();

//	          
//	          System.out.println("*********************************************************");
//	
//	animal.Ais();
//	animal.Aisplay();
//    System.out.println("*********************************************************************");
//	plants.dis();
//	plants.display();
//	System.out.println("*****************************************************************");
//	
//	
	
	
	//System.out.println("Getting all the current beans of the project....");
	
//	
//	   String[] arr=  context.getBeanDefinitionNames();
//	   int count=context.getBeanDefinitionCount();
//	   System.out.println(count);
//	   System.out.println(arr.length);
//	   
	   
	 //  System.out.println("##############################################");
	   
//	   for(String str:arr)
//	   {
//		   System.out.println("bean:"+str);
//	   }
	   System.out.println("#################################################");
	   
	   
	   
	   
	   
	   
	
	}
	
	

}
