package com.example.crm.domain.appeal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "appeals")
public interface AppealRepository extends JpaRepository<Appeal, Long> {
}
