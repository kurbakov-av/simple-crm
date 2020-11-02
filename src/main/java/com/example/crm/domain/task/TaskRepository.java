package com.example.crm.domain.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "tasks")
public interface TaskRepository extends JpaRepository<Task, Long> {
}
