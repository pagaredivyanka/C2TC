package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.lotus.entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
