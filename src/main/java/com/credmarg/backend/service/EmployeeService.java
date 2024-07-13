package com.credmarg.backend.service;

import com.credmarg.backend.model.Employee;
import com.credmarg.backend.repository.EmployeeRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
    @Autowired
    private EmployeeRepository employeeRepository;


    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
