package com.example.crm.domain.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "sms-messages")
public interface SmsMessageRepository extends JpaRepository<SmsMessage, Long> {
}
