package com.dto.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;

@Entity
public class Citizen {

	
	@Id
	private int cid;
	
	
	private String cname;
	
	
	@Valid
	private String email;
	
	
	
	@JoinColumn(name="adid")
	@OneToOne(cascade=CascadeType.ALL)
	private Aadhar  aadhar;


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Aadhar getAadhar() {
		return aadhar;
	}


	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}
	
	
}
