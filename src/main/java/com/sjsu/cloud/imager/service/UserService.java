package com.sjsu.cloud.imager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjsu.cloud.imager.entity.UserEntity;
import com.sjsu.cloud.imager.model.User;
import com.sjsu.cloud.imager.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
		
	public UserEntity authenticateUserLogin(User user) {
	  UserEntity userEntity =  userRepository.findByUserEmail(user.getUserEmail());

	  if(userEntity==null) {
		  System.out.println("Null userEntity");
	  }	  
	 return userEntity;  
	}

	public List<UserEntity> getAllUsers() {		
		List userList = new ArrayList<UserEntity>();		
		userRepository.findAll().forEach(userList::add);
		return userList;
	}
}
