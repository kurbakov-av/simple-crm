package com.example.crm.domain.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@PreAuthorize("hasAnyAuthority('ADMIN')")
@RepositoryRestResource(path = "departments")
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
