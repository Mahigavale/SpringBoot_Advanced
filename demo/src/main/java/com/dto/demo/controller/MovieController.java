package com.dto.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.dto.demo.entity.Movie;
import com.dto.demo.service.movieservice;

@RestController
public class MovieController {

	
	@Autowired
	private movieservice service;
	
	List<String> list=new ArrayList<String>();
	
	/**
	 * How to make post as Idempotent
	 * @param movie
	 * @return
	 * @throws Exception 
	 */
	@PostMapping("/add-movie")
	public Movie addmovie(@RequestBody Movie movie,@RequestHeader("header") String header) throws Exception
	{
		
		System.out.println(header);
		
		
		if(list.contains(header))
		{
			throw new Exception("duplicate request");
		}
		
		list.add(header);
		System.out.println(list.size());
		
		
		return service.addmovie(movie);
	}
	
	
	@GetMapping("/get-movie-id/{id}")
	public Movie getbyiddd(@PathVariable("id") int id)
	{
		return service.findbypk(id);
	}
}


