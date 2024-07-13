package com.credmarg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credmarg.backend.model.EmailLog;

public interface EmailLogRepository extends JpaRepository<EmailLog, Long>  {

}
