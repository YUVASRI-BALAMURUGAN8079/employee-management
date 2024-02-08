package com.example.repository;

import com.example.entity.Aadhar;
import com.example.entity.DegreeAndCertificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar,Long> {
     Aadhar findByEmployeeId(Long id);
}
