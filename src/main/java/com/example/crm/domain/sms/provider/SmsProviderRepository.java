package com.example.crm.domain.sms.provider;

import com.example.crm.domain.sms.SmsProviderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@PreAuthorize("hasRole('ADMIN')")
@RepositoryRestResource(path = "sms-providers")
public interface SmsProviderRepository extends JpaRepository<SmsProvider, Long> {

    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    SmsProvider findByName(String name);

    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    Optional<SmsProvider> findByProviderType(SmsProviderType type);
}
