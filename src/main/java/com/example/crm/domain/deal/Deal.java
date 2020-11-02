package com.example.crm.domain.deal;

import com.example.crm.domain.Document;
import com.example.crm.domain.Money;
import com.example.crm.domain.contract.Contract;
import com.example.crm.domain.employer.Employer;
import com.example.crm.domain.partner.Partner;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Entity
@Table(name = "deals")
@Data
@EqualsAndHashCode(callSuper = true)
public class Deal extends Document {

    @ManyToOne(optional = false)
    private Partner partner;

    @ManyToOne(optional = false)
    private Contract contract;

    @NotNull
    private String subject;

    @ManyToOne(optional = false)
    private DealStage state;

    @NotNull
    @PositiveOrZero
    private Integer probability;

    @NotNull
    @Embedded
    private Money money;

    private Date endAt;

    @ManyToOne(optional = false)
    private Employer manager;
}
