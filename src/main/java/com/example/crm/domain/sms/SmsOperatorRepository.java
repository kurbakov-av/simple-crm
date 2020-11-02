package com.example.crm.domain.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "sms-operators")
public interface SmsOperatorRepository extends JpaRepository<SmsOperator, Long> {
}
