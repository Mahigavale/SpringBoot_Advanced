package com.advanced.orm_tools.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advanced.orm_tools.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
