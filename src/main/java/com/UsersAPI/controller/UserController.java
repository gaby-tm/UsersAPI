package com.UsersAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UsersAPI.model.User;
import com.UsersAPI.service.UserService;


@RestController
@RequestMapping (path="/user/")

public class UserController {

	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	} // constructor
	
	@GetMapping ("/getAllUsers/")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	} // getAllUsers
	
	@PostMapping("/createUser/")
	public User createUser (@RequestBody User user) {
		return userService.createUser(user);
	}
	
} // class UserController
