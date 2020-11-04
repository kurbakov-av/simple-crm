package com.example.crm.domain.sms.provider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "sms-providers")
public interface SmsProviderRepository extends JpaRepository<SmsProvider, Long> {
    SmsProvider findByName(String name);
}
