package com.example.crm.domain.deal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "deals")
public interface DealRepository extends JpaRepository<Deal, Long> {
}
