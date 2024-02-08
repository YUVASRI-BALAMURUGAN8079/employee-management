package com.example.repository;

import com.example.entity.Pan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanRepository extends JpaRepository<Pan,Long> {

    Pan findByEmployeeId(Long id);

}
