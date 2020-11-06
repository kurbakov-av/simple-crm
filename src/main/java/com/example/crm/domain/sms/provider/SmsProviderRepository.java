package com.example.crm.domain.sms.provider;

import com.example.crm.domain.sms.SmsProviderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RestResource(path = "sms-providers")
public interface SmsProviderRepository extends JpaRepository<SmsProvider, Long> {
    SmsProvider findByName(String name);

    Optional<SmsProvider> findByProviderType(SmsProviderType type);
}
