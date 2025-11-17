package com.security.DaoAcess.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.DaoAcess.Entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	
	@Query(value="select * from user_entity where user_name= :nm", nativeQuery=true)
	public UserEntity loadbyname(@Param("nm") String nm);
}
