package com.example.crm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product-services")
public interface ProductServiceRepository extends JpaRepository<ProductService, Long> {
}
