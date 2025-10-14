package com.dto.demo.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {

	
	@Id
	private int aid;
	
	private String anumber;
	
	
	@CreationTimestamp
	private LocalDate date;
	
	
	
	@OneToOne(mappedBy="aadhar")
	private Citizen citizen;


	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
	}


	public String getAnumber() {
		return anumber;
	}


	public void setAnumber(String anumber) {
		this.anumber = anumber;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public Citizen getCitizen() {
		return citizen;
	}


	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	
	
	
}
