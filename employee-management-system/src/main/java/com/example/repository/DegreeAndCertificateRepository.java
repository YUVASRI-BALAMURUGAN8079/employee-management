package com.example.repository;

import com.example.entity.DegreeAndCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DegreeAndCertificateRepository extends JpaRepository<DegreeAndCertificate,Long> {

    List<DegreeAndCertificate> findByEmployeeId(Long id);

}
