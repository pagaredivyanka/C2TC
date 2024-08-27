package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.User;
import com.spring.lotus.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository repo;
	
	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addUser(User u) {
		
		repo.save(u);
	}

	@Override
	public void deleteUser(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateUser(Long id, User u) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(u);
		} 
		System.out.println("Record not found");	

	}

}
