package com.example.Service;

import com.example.Input.DepartmentInput;
import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) { this.departmentRepository = departmentRepository; }
    public List<Department> findAllDepartment(){
        return departmentRepository.findAll();
    }
    public Department findDepartmentByEmpId(Long id)
    {
        return departmentRepository.findByEmployeeId(id);
    }

    public Department addDepartment(DepartmentInput departmentInput)
    {
        String departmentName=departmentInput.getDepartmentName();
        Department newDepartment= new Department(departmentName);
        return departmentRepository.save(newDepartment);
    }

    public Department updateDepartment(DepartmentInput departmentInput)
    {
        Department department=departmentRepository.findById(departmentInput.getDepartmentId()).orElse(null);
        if(department!=null){
            if(departmentInput.getDepartmentName()!=null){
            department.setName(departmentInput.getDepartmentName());
            }
            return departmentRepository.save(department);
        }
        return null;
    }
    public void deleteDepartment(Long id){
        departmentRepository.deleteById(id);
    }

}
