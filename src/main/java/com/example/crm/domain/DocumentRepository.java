package com.example.crm.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "documents")
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
