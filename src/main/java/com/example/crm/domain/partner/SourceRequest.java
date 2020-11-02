package com.example.crm.domain.partner;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "source_requests")
@Data
@EqualsAndHashCode(callSuper = true)
public class SourceRequest extends Catalog {
}
