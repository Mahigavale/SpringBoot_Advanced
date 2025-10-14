package com.dto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.demo.entity.Citizen;

public interface Citizenrepo extends JpaRepository<Citizen, Integer> {

}
