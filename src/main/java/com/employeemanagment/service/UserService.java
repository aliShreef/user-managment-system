package com.employeemanagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagment.model.User;
import com.employeemanagment.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User createUser(User user) {
		return this.userRepository.save(user);
	}
	
	public User updateUser(User user) {
		return this.userRepository.save(user);
	}
	
	public long deleteUser(long userId) {
		this.userRepository.deleteById(userId);
		return userId;
	}
	
	public List<User> getAllUser(){
		return this.userRepository.findAll();
	}
	
	public User getUserById(long userId) {
		return this.userRepository.findById(userId).get();
	}
}
