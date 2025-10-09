package com.dto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.demo.DTO.ActorDto;
import com.dto.demo.entity.Actor;
import com.dto.demo.entity.Movie;
import com.dto.demo.repository.actorrepo;
import com.dto.demo.service.actorservice;
import com.dto.demo.service.movieservice;

@RestController
public class ActorController {

	
	@Autowired
	private actorservice service;
	
	
	@Autowired
	private actorrepo repo;
	
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
	
	@GetMapping("/get-by-name/{name}")
	public List<Actor> getbyname(@PathVariable("name") String name)
	{
		return service.findname(name);
		
	}
	
	@PutMapping("/update/{id}/{name}")
	public int  update(@PathVariable("id") int id, @PathVariable("name") String name)
	{
		return service.updatenamebyid(id, name);
	}
	
	@GetMapping("/find-all")
	public List<Actor> finadll()
	{
		return  repo.findAll();
		
		
		
	}
}
