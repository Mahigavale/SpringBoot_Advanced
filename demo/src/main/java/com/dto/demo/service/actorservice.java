package com.dto.demo.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.demo.DTO.ActorDto;
import com.dto.demo.DTO.MovieDto;
import com.dto.demo.entity.Actor;
import com.dto.demo.entity.Movie;
import com.dto.demo.repository.actorrepo;

@Service
public class actorservice {

	
	
	@Autowired
	private actorrepo repo;
	
	
	public Actor addactor(Actor actor)
	{
		return repo.save(actor);
	}
	
	public ActorDto getbyidact(int id)
	{
		return  (converter(repo.findById(id).get()));
	}
	
	
	
	public static ActorDto converter( Actor act)
	{
		  ActorDto dto=new ActorDto();
		  
		  dto.setAname(act.getAname());
		  
		  dto.setMovies(act.getMovies().stream().map(actorservice::con2).collect(Collectors.toList()));
		  
		 
		  return dto;
		  
	}
	
	public static MovieDto con2(Movie movie)
	{
	MovieDto dto=new MovieDto();
	
	dto.setName(movie.getName());
	return dto;
	
	}
}
