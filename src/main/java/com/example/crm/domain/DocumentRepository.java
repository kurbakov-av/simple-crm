package com.example.crm.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "documents")
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
