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

import com.spring.lotus.entity.Placement;
import com.spring.lotus.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	PlacementService service;
	
	@GetMapping("/Placements")
	public List<Placement> getAllPlacements() {
		
		return service.getAllPlacements();
	}
	
	@GetMapping("/Placement/{id}")
	public ResponseEntity<Placement> getPlacement(@PathVariable Long id) {
		
		return new ResponseEntity<Placement>(service.getPlacementById(id), HttpStatus.OK);
	}
	
	@PostMapping("/Placements")
	public void add(@RequestBody Placement p) {
		
		service.addPlacement(p);
	}
	
	@DeleteMapping("/Placement/{id}")
	public void delete(@PathVariable Long id) {
		
		service.deletePlacement(id);
	}
	
	@PutMapping("/Placement/{id}")
	public void update(@PathVariable Long id, @RequestBody Placement p) {
		
		service.updatePlacement(id, p);
	}
}
