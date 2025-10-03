package com.gov.NPCI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gov.NPCI.classes.Movie;
import com.gov.NPCI.service.MovieService;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class MovieController {
	
	
	
	@Autowired
	private MovieService service;
	
	@GetMapping("/get-movie")
	public String getdet()
	{
		return service.showdetails();
	}
	
	@GetMapping("/get-all")
	public List<Movie> getall()
	{
		System.out.println("in get all");
		return service.showallmovies();
	}
	
	@PostMapping("/find-movie")
	public Movie findmovie(@RequestParam String name2) throws Exception
	{
		 return service.searchbyname(name2);
		
	}

	 @PostMapping("/find-movie-variable/{var}")
	 public Movie find(@PathVariable("var") String var) throws Exception
	 {
		 return service.searchbyname(var);
	 }
	 
	 
	 @PostMapping("/find-by-raitngs/{rati}")
	 public List<Movie>  findbyr(@PathVariable("rati") double rati)
	 {
		 return  service.searchbyratings(rati);
	 }
	 
	 @PostMapping("/dore/{name}/{ratings}")
	 public List<Movie> dore(@PathVariable("name") String name,@PathVariable("ratings") double ratings)
	 
	 {
		 return service.toprated(ratings, name);
	 }
	 
	 
	 @PostMapping("/add-a-movie")
	 public String addone(@RequestBody Movie movie)
	 {
		 
		 return service.addmovie(movie);
	 }
	 
	 
	 @GetMapping("/get-movies")
	 public String getdemo()
	 {
		 return "this is the demo string from backend....";
	 }
}
