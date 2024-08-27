package com.spring.lotus.entity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
//@Table(name = "Students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long student_id;
	long roll_no;
	String student_name;
	String course;
	int year;
	String qualification;
	long hallTicketNo;
	
	@OneToOne
	@Autowired
	Student student_certificate;
	
	@ManyToOne
	@Autowired
	Student student_college;

	public Student() {
		super();
	}

	public Student(long student_id, long roll_no, String student_name, String course, int year, String qualification,
			long hallTicketNo) {
		super();
		this.student_id = student_id;
		this.roll_no = roll_no;
		this.student_name = student_name;
		this.course = course;
		this.year = year;
		this.qualification = qualification;
		this.hallTicketNo = hallTicketNo;
		
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public long getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(long roll_no) {
		this.roll_no = roll_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public long getHallTicketNo() {
		return hallTicketNo;
	}

	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}


	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", roll_no=" + roll_no + ", student_name=" + student_name
				+ ", course=" + course + ", year=" + year + ", qualification=" + qualification + ", hallTicketNo="
				+ hallTicketNo + "]";
	}
	
	
}
	