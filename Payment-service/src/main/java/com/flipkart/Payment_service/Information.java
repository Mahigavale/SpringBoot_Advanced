package com.flipkart.Payment_service;

public interface Information {

	/**
	 * If I don't Provide @Component => NO bean found.
	 * 
	 * @Autowired=> used to inject dependacy. 
	 * 
	 * 
	 * 
	 * @Component("upi")=> Specific component/candidate goes by the name "upi"
	 * 
	 * @Autowired
	 * @Qualifier("upi")=> will inject the dependacy of the type "upi".
	 * 
	 * 
	 * @Primary=> when more than one beans of same type found. you get the 
	 * ambiguity exception. to make a default type as primary you use the @Primary annotation.
	 * 
	 * @author Mahesh G.
	 */
}
