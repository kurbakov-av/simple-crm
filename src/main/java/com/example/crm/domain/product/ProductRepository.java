package com.example.crm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Long> {
}