package com.dto.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.dto.demo.entity.Movie;
import com.dto.demo.repository.movierepo;

@Service
public class movieservice {
	
	
	
	@Autowired
	private movierepo repo;
	
	
	@Cacheable("movies")
	public List<Movie> findallmovies() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("From the database.....");
		return repo.findAll();
	}
	
    @CacheEvict(value="movies",allEntries=true)
	public List<Movie> addmovie(Movie movie)
	{
		
    	List<Movie> list=new ArrayList<Movie>();
    	
    	Movie m=repo.save(movie);
		list.add(m);
		
		return list;
	}


    @Cacheable(value="movie" ,key="#id")
	public Movie findbypk(int id) throws InterruptedException
	{
		Thread.sleep(3000);
		
		System.out.println("the database call...");
		return repo.findById(id).get();
	}
	
    
    @CacheEvict(value="movie", allEntries = true)
    public String clearmoviecache()
    {
    	
    	return "cleared movie cache:";
    }
	
    
    @CacheEvict(value="movie", key="#id")
    public String deletebyid(int id)
    {
    	repo.deleteById(id);
    	return "movie deleted , cache cleared:";
    }
	
	
   
   
    public int  updatemovie(int id, String name)
    {
        int i=repo.updatemovie(name, id);
          return i;
    }
    
    
	
	
	
	
	
	
	
	
}
