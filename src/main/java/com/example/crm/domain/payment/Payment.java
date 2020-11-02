package com.example.crm.domain.payment;

import com.example.crm.domain.Document;
import com.example.crm.domain.Money;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "payments")
@Data
@EqualsAndHashCode(callSuper = true)
public class Payment extends Document {

    @ManyToOne(optional = false)
    private Document basisDocument;

    @NotNull
    @Embedded
    private Money money;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentProvider provider;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;
}
