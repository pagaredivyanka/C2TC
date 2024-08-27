package com.spring.lotus.entity;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Certificate {

	@Id
	private long certificate_id;
	private int year;
	
	@ManyToOne
	@Autowired
	Certificate certificate_college;
	
	public Certificate() {
		super();	
	}
	
	public Certificate(long certificate_id, int year) {
		super();
		this.certificate_id = certificate_id;
		this.year = year;
		
	}

	public long getCertificate_id() {
		return certificate_id;
	}

	public void setCertificate_id(long certificate_id) {
		this.certificate_id = certificate_id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	@Override
	public String toString() {
		return "Certificate [certificate_id=" + certificate_id + ", year=" + year + "]";
	}
	
}

