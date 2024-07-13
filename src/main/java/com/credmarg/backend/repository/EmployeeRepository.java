package com.credmarg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credmarg.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	 Employee findByEmail(String email);
}
