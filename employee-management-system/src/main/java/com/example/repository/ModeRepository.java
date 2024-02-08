package com.example.repository;

import com.example.entity.Mode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeRepository extends JpaRepository<Mode,Long> {

    Mode findByEmployeeId(Long id);

}
