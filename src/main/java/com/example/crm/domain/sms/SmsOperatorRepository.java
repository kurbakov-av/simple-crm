package com.example.crm.domain.sms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(path = "sms-operators")
public interface SmsOperatorRepository extends JpaRepository<SmsOperator, Long> {
    Optional<SmsOperator> findByName(String name);
}
