package com.advanced.orm_tools.DTO;

import java.util.List;
import java.util.stream.Collectors;

import com.advanced.orm_tools.Entity.Courses;
import com.advanced.orm_tools.Entity.Student;

public class StudentDto {

        String studentName;
        
        String studentEmail;
        
        List<CourseDto> courses;

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

		public List<CourseDto> getCourses() {
			return courses;
		}

		public void setCourses(List<CourseDto> courses) {
			this.courses = courses;
		}
        
        
}


class CourseDto
{
	String courseName;
	
	double coursePrice;

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

class StudentConverter
{
	public static  StudentDto StudentToDto(Student student)
	{
		 StudentDto dto=new StudentDto();
		 
		 dto.setStudentEmail(student.getStudentEmail());
		 dto.setStudentName(student.getStudentEmail());
		 
		 dto.setCourses(student.getCourses().stream().map(StudentConverter::courseConverter).collect(Collectors.toList()));
	
		 return dto;
	
	}
	
	
	public  static CourseDto courseConverter(Courses course)
	{
		
		CourseDto cdto=new CourseDto();
		
		cdto.setCourseName(course.getCourseName());
		
		cdto.setCoursePrice(course.getCoursePrice());
		
		return cdto;
	}
}
