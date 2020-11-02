package com.example.crm.domain.contract;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contract_types")
@Data
@EqualsAndHashCode(callSuper = true)
public class ContractType extends Catalog {
}
