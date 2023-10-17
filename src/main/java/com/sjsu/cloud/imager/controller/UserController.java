package com.sjsu.cloud.imager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sjsu.cloud.imager.entity.UserEntity;
import com.sjsu.cloud.imager.model.User;
import com.sjsu.cloud.imager.repository.UserRepository;
import com.sjsu.cloud.imager.service.UserService;

@Controller 
@RequestMapping(path="/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/addNew")
	public @ResponseBody String addNewUser (@RequestBody UserEntity myUser) {
	    
	    userRepository.save(myUser);
	    return "User Added Successfully !!";
	  }
	
	@PostMapping(path="/authenticateUser")
	public @ResponseBody UserEntity authenticateUser (@RequestBody User user) {

	   UserEntity myUser = userService.authenticateUserLogin(user); 
	    return myUser;
	  }
	
	@RequestMapping(path="/allUsers")
	public @ResponseBody List<UserEntity> getAllUsers () {
 
	    return userService.getAllUsers();
	  }
}
