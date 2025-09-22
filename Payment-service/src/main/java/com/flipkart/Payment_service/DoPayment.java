
package com.flipkart.Payment_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DoPayment {
	
	
	
	/**
	 * @Autowired => used to inject the dependacy of one type into another.
	 *  field level annotation.
	 */
	@Autowired
	@Qualifier("upi")
	private PaymentService service; 
	
	
	
	public void DoTransaction()
	{
		service.makepayment();
	}

	
}
