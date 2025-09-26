package com.gov.NPCI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gov.NPCI.classes.Movie;

@Service
public class MovieService {

	
	@Autowired
	private Movie movie;
	
	
	public String showdetails()
	{
		String col="100";
		String name="Dr.Snow";
		double ratings=9.1;
		
		movie.collection=col;
		movie.name=name;
		movie.ratings=ratings;
		
		if(movie.ratings>9.0)
		{
			return movie.toString();
		}
		return "NOT A GOOD MOVIE";
	}
}
