package com.example.crm.domain.money;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "bank-accounts")
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
