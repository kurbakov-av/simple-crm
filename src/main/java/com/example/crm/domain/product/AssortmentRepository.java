package com.example.crm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "assortments")
public interface AssortmentRepository extends JpaRepository<Assortment, Long> {
}
