package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.Certificate;
import com.spring.lotus.repository.ICertificateRepository;

@Service
public class CertificateService implements ICertificateService {

	@Autowired
	ICertificateRepository repo;
	
	@Override
	public List<Certificate> getAllCertificates() {
		
		return repo.findAll();
	}

	@Override
	public Certificate getCertificateById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addCertificate(Certificate c) {
		
		repo.save(c);
	}

	@Override
	public void deleteCertificate(Long id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateCertificate(Long id, Certificate c) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(c);
		} 
		System.out.println("Record not found");	

	}

}
