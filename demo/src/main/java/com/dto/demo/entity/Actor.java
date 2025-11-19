package com.dto.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Actor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;

	
	private static long m_id=34l;
	@Column(nullable = false)
	private String aname;

	@Column
	private String mobile;
	
	
	@JoinColumn(name="aid")
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
