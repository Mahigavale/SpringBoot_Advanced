package com.penguin_publications.Delhi_publication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	
	@Id
	private int id;
	public int getId() {
		return id;
	}

	public Book(int id, String name, double price, double ratings) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;

	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	

	

	private String name;
	private double price;
	private double ratings;
	
	
	
	
	public Book() {
		super();
	}

	
}
