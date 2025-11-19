package com.exceptions.ExceptionHandling.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Car {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message="name cannot be blank")
	String name;
	
	@Max(200)
	double price;

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

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
	
	
}
