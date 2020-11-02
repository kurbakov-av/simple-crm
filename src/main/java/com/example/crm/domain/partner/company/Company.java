package com.example.crm.domain.partner.company;

import com.example.crm.domain.Requisites;
import com.example.crm.domain.employer.Employer;
import com.example.crm.domain.partner.Partner;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
@Data
@EqualsAndHashCode(callSuper = true)
public class Company extends Partner {

    @Embedded
    private Requisites requisites;

    @ManyToOne
    private Employer director;

    @ManyToOne
    private Employer accountant;
}
