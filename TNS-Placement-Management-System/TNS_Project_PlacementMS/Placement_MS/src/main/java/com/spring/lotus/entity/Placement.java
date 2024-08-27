package com.spring.lotus.entity;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Placement {

	@Id
	private long placementId;
	private String placementName;
	private LocalDate date;
	private String qualification;
	private int year;
	
	@ManyToOne 
	@Autowired
	private College college;

	public Placement() {
		super();
	}

	public Placement(long id, String name, LocalDate date, String qualification, int year, College college) {
		super();
		this.placementId = id;
		this.placementName = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
		this.college = college;
	}

	public long getId() {
		return placementId;
	}

	public void setId(long id) {
		this.placementId = id;
	}

	public String getName() {
		return placementName;
	}

	public void setName(String name) {
		this.placementName = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Placement [id=" + placementId + ", name=" + placementName + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + ", college=" + college + "]";
	}
	
}
