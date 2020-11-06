package com.example.crm.domain.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RestResource(path = "sms-operators")
public interface SmsOperatorRepository extends JpaRepository<SmsOperator, Long> {
    Optional<SmsOperator> findByName(String name);
}
