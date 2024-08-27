package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.Certificate;

public interface ICertificateService {

	List<Certificate> getAllCertificates();
	Certificate getCertificateById(Long id);
	void addCertificate(Certificate c);
	void deleteCertificate(Long id);
	void updateCertificate(Long id, Certificate c);
}
