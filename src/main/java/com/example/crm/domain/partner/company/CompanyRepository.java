package com.example.crm.domain.partner.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "companies")
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
