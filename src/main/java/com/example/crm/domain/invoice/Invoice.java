package com.example.crm.domain.invoice;

import com.example.crm.domain.Document;
import com.example.crm.domain.Money;
import com.example.crm.domain.contract.Contract;
import com.example.crm.domain.payment.PaymentType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "invoices")
@Data
@EqualsAndHashCode(callSuper = true)
public class Invoice extends Document {

    private Date validUntil;

    @ManyToOne(optional = false)
    private Contract contract;

    @NotNull
    @Embedded
    private Money money;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @NotNull
    @Enumerated(EnumType.STRING)
    private State state;

    public enum State {
        SEND, REJECT, CANCEL, PAID;
    }
}
