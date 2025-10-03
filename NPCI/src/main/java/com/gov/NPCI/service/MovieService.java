package com.gov.NPCI.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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
	
	
	public String addmovie(Movie movie)
	{
		
	List<Movie> l1=	addMovies().stream().collect(Collectors.toList());
	
	
	l1.add(movie);
	
	for(Movie m:l1)
	{
		System.out.println(m.getRatings());
	}
	
	return movie.getName()+"added successfully....";
	}
	
//	
//	public List<Movie> add_1(String name, String collection , double ratings)
//	{
//		
//		//List<Movie> list=new ArrayList();
//				
//	 List<Movie>l1	=addMovies().stream().collect(Collectors.toList());
//		
//		l1.add(new Movie(name, collection, ratings));
//		return l1;
//		 
//		// return movie.getName()+" added sucessfully....";
//	}
	
	public List<Movie> addMovies()
	{
		List<Movie> list=Arrays.asList(new Movie("Dhadak","123.45cr",6.4),
				new Movie("Sairat","200cr",9.9),
				new Movie("Batman","500cr",9.89),
				new Movie("DDLJ","340cr",9.9),
				new Movie("Sholay","120cr",10.0),
				new Movie("Natsamrat","340cr",9.9),
				new Movie("Kakan","200cr",10.0)	,
				new Movie("IRONMAN","340cr",10.0)
				
				
		);
		return list;
	}
	
	public  List<Movie> showallmovies()
	{
		
		
		/**
		 * I am using the comparator<Movie> in the  sorted here to 
		 * sort the movies in the descending order based on 
		 * the ratings.
		 */
		System.out.println("accessed");
		
		return  addMovies().stream().sorted((i,j)->
		((int)i.ratings-(int)j.ratings)).collect(Collectors.toList());
	}
	
	
	
	public Movie searchbyname(String name2) throws Exception
	{
		
		System.out.println("got the value from the controller:"+name2);
		List<Movie> list=addMovies();
		
		Iterator<Movie> itr=list.iterator();
		
		System.out.println("Searching the movie......"+name2);
		Movie m2=new Movie();
		while(itr.hasNext())
		{
			Movie movie=itr.next();
			if((movie.name).equalsIgnoreCase(name2))
			{
				System.out.println("Movie:Found:"+name2);
				m2= movie;
				break;
			}
			else
			{
				m2=null;
				//System.out.println("Sorry , movie is not found");
			}
		}
		if(m2==null)
		{
			System.out.println("neat movie de be !");
			throw new Exception("Movie not found....reeee");
		}
		return m2;
	} 
	
	
	public List<Movie> searchbyratings(double ratin)
	{
		 List<Movie> list=addMovies();
		 
		 
	 return	 list.stream().filter((i)->(i.ratings==ratin)).collect(Collectors.toList());
	}
	
	public List<Movie> toprated(double ratings,String name)
	{
		List<Movie> demo=addMovies();
		
		
	 return	demo.stream().filter((i)->(i.ratings==ratings && (i.name).equalsIgnoreCase(name))).
				collect(Collectors.toList());
			
	}
	
	public MovieService()
	{
		
	}
}
