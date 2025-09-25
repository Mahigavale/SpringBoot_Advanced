package com.ebay.order_service.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Order {

	public Order()
	{
		System.out.println("Order created......");
		counter++;
	}
	public static int  counter=0;
	
	/**
	 * 
	 * @Component
	 * @Scope("singleton")=> optional as the default scope is singleton.
	 * generally used when you want to share the same state across the springboot application.
	 * 
	 * 
	 * 
	 * @Component
	 * @Scope("prototype")
	 * this scope is used to create a new instance each and every time a bean is required.
	 * generally this scope is used to maintain the seperation of the states/information/data/
	 * less secure.
	 * 
	 * 
	 * 
	 * @RequestScope => web aware beans.
	 * it is going to be accessed through the web.
	 * each http method call will generate an new instance
	 * of the above said bean.
	 * 
	 * 
	 * @SessionScope=> web aware beans.
	 * will create a separate instance each time
	 * session/tab/browser is changed.
	 */
	
	
	public String getorderdetails()
	{
		
		return "Product: water bottle, price:3432.43, ratings:6.7";
	}
	
	
    public Object getdet()
    {
    	return this.hashCode();
    }
	
	
}
