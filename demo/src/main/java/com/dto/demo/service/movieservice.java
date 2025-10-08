package com.dto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.demo.entity.Movie;
import com.dto.demo.repository.movierepo;

@Service
public class movieservice {
	
	
	
	@Autowired
	private movierepo repo;
	
	
	
	public Movie addmovie(Movie movie)
	{
		
		return repo.save(movie);
	}

	public Movie findbypk(int id)
	{
		return repo.findById(id).get();
	}
}
