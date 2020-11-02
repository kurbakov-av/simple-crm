package com.example.crm.domain.product.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "product-categories")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
