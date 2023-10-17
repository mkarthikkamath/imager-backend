package com.sjsu.cloud.imager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sjsu.cloud.imager.entity.AdminEntity;

@Repository
public interface AdminRepository extends CrudRepository<AdminEntity, String>{
	
	AdminEntity findByAdminEmail(String adminEmail);

}
