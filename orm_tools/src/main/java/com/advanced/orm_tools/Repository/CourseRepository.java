package com.advanced.orm_tools.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advanced.orm_tools.Entity.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long> {

}
