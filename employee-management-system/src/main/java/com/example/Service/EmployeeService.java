package com.example.Service;

import com.example.Input.EmployeeInput;
import com.example.entity.Department;
import com.example.entity.Designation;
import com.example.entity.Employee;
import com.example.entity.Mode;
import com.example.repository.DepartmentRepository;
import com.example.repository.DesignationRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.ModeRepository;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;
    private DesignationRepository designationRepository;
    private ModeRepository modeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository, DesignationRepository designationRepository,ModeRepository modeRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
        this.designationRepository = designationRepository;
        this.modeRepository=modeRepository;
    }

    public List<Employee> findAllEmployee(){return employeeRepository.findAll();}
    public Employee findEmployeeByEmployeeId(Long id)
    {
        return employeeRepository.findById(id).orElse(null);
    }

    //// mutation

   /* public void deleteEmployeeById(Long id)
    {
        employeeRepository.deleteById(id);
    }*/


    public Employee addEmployee(EmployeeInput employeeInput)
    {
        // Extract data from the input
        String firstName = employeeInput.getFirstName();
        String lastName = employeeInput.getLastName();
        Date dateOfJoining=employeeInput.getDateOfJoining();
        //int yearOfService=employeeInput.getYearOfService();

        Long designationId = employeeInput.getDesignationId();
        Long departmentId = employeeInput.getDepartmentId();
        Long modeId=employeeInput.getModeId();
        // Fetch the associated designation and department from the database
        Designation designation = designationRepository.findById(designationId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid designationId"));

        Department department = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid departmentId"));
        Mode mode = modeRepository.findById(modeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid modeId"));

        // Create a new Employee instance with the provided data and associations
        Employee newEmployee = new Employee(firstName, lastName, dateOfJoining, designation,department,mode);

        // Save the new employee to the database
        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployeeById(EmployeeInput employeeInput){
        Employee employee=employeeRepository.findById(employeeInput.getEmployeeId()).orElse(null);
        if(employee!=null)
        {
            if(employeeInput.getFirstName()!=null)employee.setFirstName(employeeInput.getFirstName());
            if(employeeInput.getLastName()!=null)employee.setLastName(employeeInput.getLastName());
            if(employeeInput.getDateOfJoining()!=null)employee.setDateOfJoining(employeeInput.getDateOfJoining());
            //if(employeeInput.getYearOfService()!=null)
                //employee.setYearOfService(employeeInput.getYearOfService());
            if(employeeInput.getDepartmentId()!=null)employee.setDepartment(departmentRepository.findById(employeeInput.getDepartmentId()).orElse(null));
            if(employeeInput.getDesignationId()!=null)employee.setDesignation(designationRepository.findById(employeeInput.getDesignationId()).orElse(null));
            if(employeeInput.getModeId()!=null)employee.setMode(modeRepository.findById(employeeInput.getModeId()).orElse(null));
        }

        return  employeeRepository.save(employee);
    }

}
