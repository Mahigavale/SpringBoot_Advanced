package com.profiles.SpringProfiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profiles.SpringProfiles.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
