package com.dto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dto.demo.entity.Movie;

import io.lettuce.core.dynamic.annotation.Param;
import jakarta.transaction.Transactional;

public interface movierepo extends JpaRepository<Movie, Integer> {

	
	@Modifying
	@Transactional
	@Query(value="update movie set name=:nm where id= :id;",nativeQuery=true)
	public int updatemovie(@Param("nm") String nm, @Param("id") int id);

		
}
