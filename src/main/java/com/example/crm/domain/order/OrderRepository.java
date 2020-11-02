package com.example.crm.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "orders")
public interface OrderRepository extends JpaRepository<Order, Long> {
}
