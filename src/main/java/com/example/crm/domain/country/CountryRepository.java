package com.example.crm.domain.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@RepositoryRestResource(path = "countries")
public interface CountryRepository extends JpaRepository<Country, Long> {
}
