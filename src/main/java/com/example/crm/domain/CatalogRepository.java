package com.example.crm.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "catalogs")
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
}
