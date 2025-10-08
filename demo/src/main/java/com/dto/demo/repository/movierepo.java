package com.dto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.demo.entity.Movie;

public interface movierepo extends JpaRepository<Movie, Integer> {

}
