package com.credmarg.backend.service;

import com.credmarg.backend.model.Vendor;
import com.credmarg.backend.repository.VendorRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
	@Autowired
    private VendorRepository vendorRepository;
    
    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public Vendor findByEmail(String email) {
        return vendorRepository.findByEmail(email);
    }
    
    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
