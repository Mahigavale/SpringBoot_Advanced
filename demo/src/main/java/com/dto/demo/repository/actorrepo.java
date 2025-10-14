package com.dto.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dto.demo.entity.Actor;

import jakarta.transaction.Transactional;

public interface actorrepo extends JpaRepository<Actor, Integer> {

	

	 @Query(value="select * from actor where aname= :name;", nativeQuery=true)
	 public List<Actor>  findByName(@Param("name")String name);
	 
	 
	 
	 @Modifying
	 @Transactional
	 @Query(value="update actor set aname= :nm where aid= :id;", nativeQuery=true)
	 public int  updatebyid(@Param("id") int id, @Param("nm") String name);
	 
	 
	 
	 @Modifying
	 @Transactional
	 @Query(value="delete from actor where aid=:id", nativeQuery=true)
	 public int delete(@Param("id") int id);
	 
}

