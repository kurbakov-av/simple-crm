package com.example.crm.domain.deal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@PreAuthorize("hasAnyAuthority('ADMIN')")
@RepositoryRestResource(path = "deal-stages")
public interface DealStageRepository extends JpaRepository<DealStage, Long> {
}
