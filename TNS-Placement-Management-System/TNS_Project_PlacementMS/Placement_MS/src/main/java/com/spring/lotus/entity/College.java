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
//@Table(name = "Colleges")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long college_id;
	String college_name;
	String location;
	
	@OneToOne
	@Autowired
//	@ManyToOne
	User college_admin;

	public College() {
		super();
	}

	public College(long college_id, String college_name, String location, User college_admin) {
		super();
		this.college_id = college_id;
		this.college_name = college_name;
		this.location = location;
		this.college_admin = college_admin;
	}

	public long getCollege_id() {
		return college_id;
	}

	public void setCollege_id(long college_id) {
		this.college_id = college_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public User getCollege_admin() {
		return college_admin;
	}

	public void setCollege_admin(User college_admin) {
		this.college_admin = college_admin;
	}

	@Override
	public String toString() {
		return "College [college_id=" + college_id + ", college_name=" + college_name + ", location=" + location
				+ ", college_admin=" + college_admin + "]";
	}
	
}
