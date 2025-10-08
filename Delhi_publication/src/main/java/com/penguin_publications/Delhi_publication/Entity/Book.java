package com.penguin_publications.Delhi_publication.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Book {

	
	
	/**
	 * IDENTITY=> start from 1 and keep increasing by 1
	 */
	
	
	public int getId() {
		return id;
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

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private double ratings;
	
	
	
	
	
	
	
	

//	public Author getAuthor() {
//		return author;
//	}
//

//
//	public void setAuthor(Author author) {
//		this.author = author;
//	}



//	public Book(int id, String name, double price, double ratings, Author author) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.price = price;
//		this.ratings = ratings;
//		
//	}



	public Book(int id, String name, double price, double ratings) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
		
	}

	public Book() {
		super();
	}

	
}
