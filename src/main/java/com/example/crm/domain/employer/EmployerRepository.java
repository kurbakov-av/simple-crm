package com.example.crm.domain.employer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "employers")
public interface EmployerRepository extends JpaRepository<Employer, Long> {
}