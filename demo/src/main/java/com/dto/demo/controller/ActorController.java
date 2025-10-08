package com.dto.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.demo.DTO.ActorDto;
import com.dto.demo.entity.Actor;
import com.dto.demo.entity.Movie;
import com.dto.demo.service.actorservice;
import com.dto.demo.service.movieservice;

@RestController
public class ActorController {

	
	@Autowired
	private actorservice service;
	
	
	
	
	@PostMapping("/add-actor")
	public Actor addactorrrr(@RequestBody Actor act)
	{
		return service.addactor(act);
	}
	
	
	@GetMapping("/get-actor-id/{id}")
	public ActorDto getbyiddd(@PathVariable("id") int id)
	{
		return service.getbyidact(id);
	}
}
