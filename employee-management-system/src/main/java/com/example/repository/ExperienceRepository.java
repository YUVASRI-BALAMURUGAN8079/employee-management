package com.example.repository;

import com.example.entity.DegreeAndCertificate;
import com.example.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience,Long> {

    List<Experience> findByEmployeeId(Long id);

}
