package com.employeemanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagment.model.User;
import com.employeemanagment.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserCOntroller {
	
	@Autowired
	UserService userService;
	
	
	// get users
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(this.userService.getAllUser());
	}
	// get user by Id
	@RequestMapping(method = RequestMethod.GET , value = "/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(name = "id") long id){
		return ResponseEntity.ok(this.userService.getUserById(id));
	}
	// save user
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return ResponseEntity.ok(this.userService.createUser(user));
	}
	// update User
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<User> updateUser(@RequestBody User user){
		return ResponseEntity.ok(this.userService.updateUser(user));
	}
	// Delete User
	@RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
	public ResponseEntity<Long> deleteUserById(@PathVariable(name = "id") long id) {
		return ResponseEntity.ok(this.userService.deleteUser(id));
	}
	
	

}
