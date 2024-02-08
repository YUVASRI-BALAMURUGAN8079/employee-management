package com.example.repository;

import com.example.entity.Resignation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.ManyToOne;

@Repository
public interface ResignationRepository extends JpaRepository<Resignation,Long> {
    Resignation findByEmployeeId(Long id);
    void deleteByEmployeeId(Long id);

}
