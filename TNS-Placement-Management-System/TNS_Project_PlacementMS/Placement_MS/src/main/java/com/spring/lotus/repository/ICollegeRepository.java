package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.lotus.entity.College;

public interface ICollegeRepository extends JpaRepository<College, Long>{
	
}
