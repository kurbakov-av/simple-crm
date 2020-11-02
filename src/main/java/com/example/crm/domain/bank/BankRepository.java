package com.example.crm.domain.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "banks")
public interface BankRepository extends JpaRepository<Bank, Long> {
}
