package com.example.crm.domain.payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "payments")
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
