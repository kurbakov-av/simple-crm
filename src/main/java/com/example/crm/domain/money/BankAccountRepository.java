package com.example.crm.domain.money;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RepositoryRestResource(path = "bank-accounts")
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
