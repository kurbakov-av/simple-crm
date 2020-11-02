package com.example.crm.domain.deal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "deal-stages")
public interface DealStageRepository extends JpaRepository<DealStage, Long> {
}
