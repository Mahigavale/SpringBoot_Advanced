package com.dto.demo.DTO;

import java.util.List;

public class ActorDto {

	
	 private String aname;
	 
	 List<MovieDto> movies;
	 public String getAname() {
		 return aname;
	 }

	 public void setAname(String aname) {
		 this.aname = aname;
	 }

	 public List<MovieDto> getMovies() {
		 return movies;
	 }

	 public void setMovies(List<MovieDto> movies) {
		 this.movies = movies;
	 }

	
	 
	 
	 
}
