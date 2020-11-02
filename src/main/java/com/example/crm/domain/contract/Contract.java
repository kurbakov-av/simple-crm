package com.example.crm.domain.contract;

import com.example.crm.domain.Document;
import com.example.crm.domain.Money;
import com.example.crm.domain.employer.Employer;
import com.example.crm.domain.partner.Partner;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "contracts")
@Data
@EqualsAndHashCode(callSuper = true)
public class Contract extends Document {

    private boolean active;

    private Date startAt;

    private Date endAt;

    @ManyToOne(optional = false)
    private Employer manager;

    @ManyToOne(optional = false)
    private Partner partner;

    @NotNull
    @Embedded
    private Money money;
}
