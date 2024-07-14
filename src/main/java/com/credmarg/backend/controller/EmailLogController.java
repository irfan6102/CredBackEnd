package com.credmarg.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credmarg.backend.model.EmailLog;
import com.credmarg.backend.service.EmailLogService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/admin/api/emailLogs")
public class EmailLogController {

    @Autowired
    private EmailLogService emailLogService;

    @GetMapping
    public List<EmailLog> getAllEmailLogs() {
        return emailLogService.getAllEmailLogs();
    }
}
