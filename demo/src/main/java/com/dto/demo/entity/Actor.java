package com.dto.demo.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;

	@Column(nullable = false)
	private String aname;

	private String mobile;
	
	
	@JoinColumn
	@OneToMany
	private  List<Movie> movies;
	

	public int getAid() {
		return aid;
	}

	

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String address;




	public List<Movie> getMovies() {
		return movies;
	}



	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}



	

}
