package com.credmarg.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credmarg.backend.model.EmailRequest;
import com.credmarg.backend.model.Employee;
import com.credmarg.backend.model.Vendor;
import com.credmarg.backend.service.EmailService;
import com.credmarg.backend.service.EmployeeService;
import com.credmarg.backend.service.VendorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin")
public class CredController {
	
	@Autowired
    private  EmployeeService employeeService;
	@Autowired
    private  VendorService vendorService;
	
	@Autowired
	private EmailService emailService;
	
	@PostMapping("/createVendor")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return vendorService.saveVendor(vendor);
    }

    @GetMapping("/getAllemployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    @PostMapping("/createEmployee")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("Employee created successfully");
    }

    @GetMapping("/getAllvendors")
    public List<Vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    @GetMapping("/employee/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email) {
        return employeeService.findByEmail(email);
    }

    @GetMapping("/vendor/{email}")
    public Vendor getVendorByEmail(@PathVariable String email) {
        return vendorService.findByEmail(email);
    }
    
    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendEmail(emailRequest.getToEmail(), emailRequest.getSubject(), emailRequest.getBody());
        return ResponseEntity.ok("Email sent successfully");
    }
    
}
