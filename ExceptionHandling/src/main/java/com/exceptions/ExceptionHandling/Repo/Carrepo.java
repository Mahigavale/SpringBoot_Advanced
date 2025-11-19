package com.exceptions.ExceptionHandling.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptions.ExceptionHandling.Entity.Car;

public interface Carrepo extends JpaRepository<Car, Integer> {

}
