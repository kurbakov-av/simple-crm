package com.example.crm.domain.scope;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
@RepositoryRestResource(path = "scopes-activities")
public interface ScopeActivityRepository extends JpaRepository<ScopeActivity, Long> {
}
