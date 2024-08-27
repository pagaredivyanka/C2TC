package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.lotus.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Long>{

}



