package com.credmarg.backend.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.credmarg.backend.model.EmailLog;
import com.credmarg.backend.repository.EmailLogRepository;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private EmailLogRepository emailLogRepository;

	@Value("${spring.mail.username}")
	String fromEmail;

	public void sendEmail(List<String> toEmail, String subject, String body) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(fromEmail);
		mailMessage.setTo(toEmail.toArray(new String[toEmail.size()]));
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
		EmailLog emailLog = new EmailLog(String.join(", ", toEmail), subject, body, LocalDateTime.now());
		emailLogRepository.save(emailLog);
		mailSender.send(mailMessage);
	}
}
