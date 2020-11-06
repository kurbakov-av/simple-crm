package com.example.crm.domain.partner.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RepositoryRestResource(path = "companies")
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
