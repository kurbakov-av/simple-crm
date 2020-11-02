package com.example.crm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "assortments")
public interface AssortmentRepository extends JpaRepository<Assortment, Long> {
}
