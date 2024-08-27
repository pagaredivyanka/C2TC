package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.User;

public interface IUserService {

	List<User> getAllUsers();
	User getUserById(Long id);
	void addUser(User u);
	void deleteUser(Long id);
	void updateUser(Long id, User u);
}
