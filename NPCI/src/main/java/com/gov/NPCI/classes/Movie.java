package com.gov.NPCI.classes;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	
	
	public String name;
	
	public String collection;
	
	
	public double ratings;
	
	
	
	/**
	 * NO args Constructor.
	 */
	public Movie()
	{
		System.out.println("Movie created...");
	}

 
	
	/**
	 * All args Constructor
	 * @param name
	 * @param collection
	 * @param ratings
	 */
	public Movie(String name,String collection, double ratings )
	{
		        this.collection=collection;
				this.name=name;
				this.ratings=ratings;
		
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", collection=" + collection + ", ratings=" + ratings + "]";
	}

	
	
}
