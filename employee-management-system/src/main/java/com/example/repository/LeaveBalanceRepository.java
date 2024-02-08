package com.example.repository;

import com.example.entity.LeaveBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance,Long> {

    LeaveBalance findByEmployeeId(Long id);
    void deleteByEmployeeId(Long id);
}
