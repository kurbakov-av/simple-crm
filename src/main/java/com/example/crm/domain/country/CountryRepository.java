package com.example.crm.domain.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "countries")
public interface CountryRepository extends JpaRepository<Country, Long> {
}
