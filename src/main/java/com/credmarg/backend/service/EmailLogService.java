package com.credmarg.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.backend.model.EmailLog;
import com.credmarg.backend.repository.EmailLogRepository;

@Service
public class EmailLogService {
	@Autowired
    private EmailLogRepository emailLogRepository;

    public List<EmailLog> getAllEmailLogs() {
        return emailLogRepository.findAll();
    }

    public void saveEmailLog(EmailLog emailLog) {
        emailLogRepository.save(emailLog);
    }
}
