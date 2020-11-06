package com.example.crm.domain.product.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "manufacturers")
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
