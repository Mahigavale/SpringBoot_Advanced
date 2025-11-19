package com.security.RBA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.security.RBA.Entity.UserEntity;

public interface Userrepo extends JpaRepository<UserEntity, Integer> {

	
	@Query(value="select * from user_entity where username=:name", nativeQuery=true)
	public UserEntity loadbyusername(@Param("name")String name);
}
