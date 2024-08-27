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

import com.spring.lotus.entity.College;
import com.spring.lotus.service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService service;
	
	@GetMapping("/Colleges")
	public List<College> getAllColleges() {
		
		return service.getAllColleges();
	}
	
	@GetMapping("/College/{id}")
	public ResponseEntity<College> getCollege(@PathVariable Long id) {
		
		return new ResponseEntity<College>(service.getCollegeById(id), HttpStatus.OK);
	}
	
	@PostMapping("/Colleges")
	public void add(@RequestBody College c) {
		
		service.addCollege(c);
	}
	
	@DeleteMapping("/College/{id}")
	public void delete(@PathVariable Long id) {
		
		service.deleteCollege(id);
	}
	
	@PutMapping("/College/{id}")
	public void update(@PathVariable Long id, @RequestBody College c) {
		
		service.updateCollege(id, c);
	}
}
