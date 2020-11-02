package com.example.crm.domain.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "departments")
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
