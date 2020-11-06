package com.example.crm.domain.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contracts")
public interface ContractRepository extends JpaRepository<Contract, Long> {
}
