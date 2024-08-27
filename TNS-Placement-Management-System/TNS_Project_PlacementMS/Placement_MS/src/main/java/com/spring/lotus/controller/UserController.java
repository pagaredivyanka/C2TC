package com.spring.lotus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.lotus.entity.User;
import com.spring.lotus.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/Users")
	public List<User> getAllUsers() {
		
		return service.getAllUsers();
	}
	
	@GetMapping("/User/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id) {
		
		return new ResponseEntity<User>(service.getUserById(id), HttpStatus.OK);
	}
	
	@PostMapping("/Users")
	public void add(@RequestBody User p) {
		
		service.addUser(p);
	}
	
	@DeleteMapping("/User/{id}")
	public void delete(@PathVariable Long id) {
		
		service.deleteUser(id);
	}
	
	@PutMapping("/User/{id}")
	public void update(@PathVariable Long id, @RequestBody User p) {
		
		service.updateUser(id, p);
	}
}
