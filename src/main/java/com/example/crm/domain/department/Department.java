package com.example.crm.domain.department;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.partner.company.Company;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@Data
@EqualsAndHashCode(callSuper = true)
public class Department extends Catalog {

    @ManyToOne(optional = false)
    private Company company;
}
