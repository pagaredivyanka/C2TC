package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.College;
import com.spring.lotus.repository.ICollegeRepository;

@Service
public class CollegeService implements ICollegeService {
	
	@Autowired
	ICollegeRepository repo;
	
	@Override
	public List<College> getAllColleges() {
		
		return repo.findAll();
	}

	@Override
	public College getCollegeById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addCollege(College c) {
		
		repo.save(c);
	}

	@Override
	public void deleteCollege(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateCollege(Long id, College c) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(c);
		} 
		System.out.println("Record not found");	

	}
}
