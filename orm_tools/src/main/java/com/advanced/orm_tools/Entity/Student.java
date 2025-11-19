package com.advanced.orm_tools.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studentId;
	
	@NotNull(message="name must be not null")
	@NotBlank(message="name must not only contain the white spaces.")
	private String studentName;
	
	@NotNull(message="email must be not null")
	@NotBlank(message="email length must not contain only the whitespaces.")
	@NotEmpty(message=" email length must be greater than the zero.")
	private String studentEmail;


	
	
	/**
	 * OneToMany and mapped by is used in the 
	 * secondary table and not in the primary.
	 * so always remember whoever has the @JoinColumn annotation is the 
	 * primary table.
	 */
	
	@OneToMany(mappedBy="student",cascade = CascadeType.ALL)
	private List<Courses> courses;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

	
	public long getStudentId() {
		return studentId;
	}
	
	
	
	
}
