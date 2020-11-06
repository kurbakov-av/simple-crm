package com.example.crm.domain.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "contract-types")
public interface ContractTypeRepository extends JpaRepository<ContractType, Long> {
}
