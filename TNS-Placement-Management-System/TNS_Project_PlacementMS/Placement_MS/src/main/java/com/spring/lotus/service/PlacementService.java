package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.Placement;
import com.spring.lotus.repository.IPlacementRepository;

@Service
public class PlacementService implements IPlacementService {

	@Autowired
	IPlacementRepository repo;
	
	@Override
	public List<Placement> getAllPlacements() {
		
		return repo.findAll();
	}

	@Override
	public Placement getPlacementById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addPlacement(Placement p) {
		
		repo.save(p);
	}

	@Override
	public void deletePlacement(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updatePlacement(Long id, Placement p) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(p);
		} 
		System.out.println("Record not found");	

	}
}
