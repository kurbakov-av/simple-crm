package com.example.crm.domain.partner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "partners")
public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
