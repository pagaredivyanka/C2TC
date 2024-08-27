package com.spring.lotus.service;

import java.util.List;
import com.spring.lotus.entity.Student;

public interface IStudentService {

	List<Student> getAllStudents();
	Student getStudentById(Long id);
	void addStudent(Student s);
	void updateStudent(Long id, Student s);
	void searchStudentById(long id);
	void searchStudentByHallTicket(long ticketNo);
	void deleteStudent(Long id);
	
}





	

