package com.dto.demo.entity;

import java.io.Serializable;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie implements Serializable {
	
	
	private static long id_m =1l;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String name;
	
	private double mcollection;

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMcollection() {
		return mcollection;
	}

	public void setMcollection(double mcollection) {
		this.mcollection = mcollection;
	}
	
	
	
}
