package com.example.repository;

import com.example.entity.DrivingLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense,Long> {

    DrivingLicense findByEmployeeId(Long id);

}
