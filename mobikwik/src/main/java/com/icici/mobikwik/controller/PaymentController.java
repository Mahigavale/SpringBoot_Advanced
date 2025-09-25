package com.icici.mobikwik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	/**
	 * @RestController => create a controller which will expose the http methods.
	 * to client.
	 * @ClassLevelANNOTATION
	 */
	
	
	//POST
	//PUT
	//GET
	//DELETE
	//PATCH
	
	/**
	 * 
	 * @return the string.
	 * HTTP=> GET.
	 */
	
	@GetMapping("/getdata")
	public String returngreeting()
	{
		return "Advanced Java";
	}
}
