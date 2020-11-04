package com.example.crm.domain.invoice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path = "invoices")
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}