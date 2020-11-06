package com.example.crm.domain.employer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "positions")
public interface PositionRepository extends JpaRepository<Position, Long> {
}
