package com.credmarg.backend.model;

import java.util.List;

public class EmailRequest {
	private List<String> toEmail;
	private String subject;
	private String template="Subject: Payment Notification for Vendor {name}\r\n"
			+ "\r\n"
			+ "Dear {name},\r\n"
			+ "\r\n"
			+ "This is to notify you that a payment has been sent to your UPI {upi}.\r\n"
			+ "\r\n"
			+ "Thank you,\r\n"
			+ "Admin Team\r\n"
			+ "";

	public List<String> getToEmail() {
		return toEmail;
	}

	public void setToEmail(List<String> toEmail) {
		this.toEmail = toEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return template;
	}

}
