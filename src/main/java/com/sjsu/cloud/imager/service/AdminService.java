package com.sjsu.cloud.imager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjsu.cloud.imager.entity.AdminEntity;
import com.sjsu.cloud.imager.model.Admin;
import com.sjsu.cloud.imager.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
		
	public AdminEntity authenticateAdminLogin(Admin admin) {
	  AdminEntity adminEntity =  adminRepository.findByAdminEmail(admin.getAdminEmail());

	  if(adminEntity==null) {
		  System.out.println("Null AdminEntity");
	  }	   
	 return adminEntity;  
	}

	public String saveNewAdmin(AdminEntity myAdmin) {
		adminRepository.save(myAdmin); 
		return "Admin added successfully";
	}
}
