package com.spring.lotus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.lotus.entity.Certificate;
import com.spring.lotus.service.CertificateService;


@RestController
public class CertificateController {

	@Autowired
	CertificateService service;
	
	@GetMapping("/Certificates")
	public List<Certificate> getAllCertificates() {
		
		return service.getAllCertificates();
	}
	
	@GetMapping("/Certificate/{id}")
	public ResponseEntity<Certificate> getCertificate(@PathVariable Long id) {
		
		return new ResponseEntity<Certificate>(service.getCertificateById(id), HttpStatus.OK);
	}
	
	@PostMapping("/Certificates")
	public void add(@RequestBody Certificate p) {
		
		service.addCertificate(p);
	}
	
	@DeleteMapping("/Certificate/{id}")
	public void delete(@PathVariable Long id) {
		
		service.deleteCertificate(id);
	}
	
	@PutMapping("/Certificate/{id}")
	public void update(@PathVariable Long id, @RequestBody Certificate p) {
		
		service.updateCertificate(id, p);
	}
}