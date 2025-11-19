package com.advanced.orm_tools.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Courses {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long courseId;
	
	
	@NotNull(message="course must be not null.")
	@NotBlank(message="course must not contain only the whitespaces.")
	@NotEmpty(message="course must be not empty. i.e. it must have something greater than zero.")
	private String courseName;
	
	
	private double coursePrice;

	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sid")
	private Student student;

	public long getCourseId() {
		return courseId;
	}


	


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getCoursePrice() {
		return coursePrice;
	}


	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	

}
