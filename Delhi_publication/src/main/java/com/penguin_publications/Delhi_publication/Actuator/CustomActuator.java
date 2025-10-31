package com.penguin_publications.Delhi_publication.Actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import com.penguin_publications.Delhi_publication.Service.AuthorService;

@Component
@Endpoint(id = "authorinfo")
public class CustomActuator {

	@Autowired
	private AuthorService service;

	/**
	 * GetMapping => default => /actuator/authorinfo
	 * @return
	 * @throws Exception
	 */
	@ReadOperation
	public Map<String, Integer> authorsize() throws Exception {

		int size = service.getall().size();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Total Size:", size);
		return map;
	}
	
	
	
	
	/**
	 * Like request body
	 * @param name
	 * @param id
	 * @return
	 */
	@WriteOperation
	public String adddata( String name, int  id)
	{
		return name+100+id;
	}
	
	/**
	 * Like Path Variable => @Selector => dynamic url
	 * @param name
	 * @param id
	 * @param salary
	 * @return
	 */
	@WriteOperation
	public String adddata(@Selector String name, @Selector int  id, @Selector double salary)
	{
		return name+100+id+salary;
	}
	
	
//	@WriteOperation
//	public Map<String, Integer> add()
//	{
//		Map<String , Integer> map=new HashMap<String, Integer>();
//		
//		map.put("nukk", 23);
//		
//		return map;
//	}

}
