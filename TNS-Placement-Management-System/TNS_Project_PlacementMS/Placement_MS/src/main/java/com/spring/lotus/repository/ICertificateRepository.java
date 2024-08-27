package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.lotus.entity.Certificate;

public interface ICertificateRepository extends JpaRepository<Certificate, Long> {

}
