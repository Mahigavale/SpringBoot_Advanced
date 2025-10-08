package com.dto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.demo.entity.Actor;

public interface actorrepo extends JpaRepository<Actor, Integer> {

}
