package com.example.repository;

import com.example.entity.Department;
import com.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  DepartmentRepository extends JpaRepository<Department,Long> {

    Department findByEmployeeId(Long id);

}
