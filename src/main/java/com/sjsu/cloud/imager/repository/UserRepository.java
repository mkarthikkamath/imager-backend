package com.sjsu.cloud.imager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sjsu.cloud.imager.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String>{
	
	UserEntity findByUserEmail(String userEmail);

}
