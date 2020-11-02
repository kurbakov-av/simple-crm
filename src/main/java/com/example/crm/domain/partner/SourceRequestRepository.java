package com.example.crm.domain.partner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "source-requests")
public interface SourceRequestRepository extends JpaRepository<SourceRequest, Long> {
}
