package com.UsersAPI.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UsersAPI.model.User;
import com.UsersAPI.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	} // getAllUsers
	
	public User createUser (User user) {
		User tmpUser = null;
		if (userRepository.findById(user.getLogin()).isEmpty()) {
			String encodedPassword = Base64.getEncoder().encodeToString(user.getUserpassword().getBytes());
			user.setUserpassword(encodedPassword); 
			tmpUser = userRepository.save(user);
		} else {
			System.out.println("The user " + user.getLogin() + " already exists");
		}
		return tmpUser;
	} // crearUsuario
	
	public User deleteUser (User user) {
		User userTmp = null;
		if (userRepository.existsById(user.getLogin())) {
			userTmp = userRepository.findById(user.getLogin()).get();
			userRepository.deleteById(user.getLogin());
			}//if
		return userTmp;
	}//deleteUsuario
	
	
} // class UserService
