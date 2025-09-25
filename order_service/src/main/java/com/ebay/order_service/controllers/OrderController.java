package com.ebay.order_service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebay.order_service.components.Order;

@RestController
public class OrderController {

	
	/**
	 * @RestController =>@ResponseBody+@Controller
	 *
	 */
	
	
	@Autowired
	private Order order1;
	
	
	@GetMapping("/hi")
	public String greetings()
	{
		
//	boolean result=	(order1.hashCode()==order2.hashCode());
		return "Hello,From the springboot application....";
	}
	
	
	@GetMapping("/get-code")
	public Object getre()
	{
	
		return order1.getdet();
		
		
		
	}
	
	@GetMapping("/get-code-2")
	public Object getre2()
	{
		return order1.getdet();
	}
	
	
}
