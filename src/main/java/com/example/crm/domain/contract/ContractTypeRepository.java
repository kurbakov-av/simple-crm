package com.example.crm.domain.contract;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
@RepositoryRestResource(path = "contract-types")
public interface ContractTypeRepository extends JpaRepository<ContractType, Long> {
}
