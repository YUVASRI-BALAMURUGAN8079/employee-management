package com.example.repository;

import com.example.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationRepository extends JpaRepository<Designation,Long> {

    Designation findByEmployeeId(Long id);

}
