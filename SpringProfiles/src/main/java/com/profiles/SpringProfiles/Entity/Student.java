package com.profiles.SpringProfiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Student {
	
	@Id
	private int id;
	
	
	@NotBlank(message="name cannot be blank..")
	private String name;

	
	@NotBlank(message="email required....")
	private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
