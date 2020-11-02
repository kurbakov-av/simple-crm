package com.example.crm.domain.money;

import com.example.crm.domain.bank.Bank;
import com.example.crm.domain.partner.Partner;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bank_accounts")
@Data
public class BankAccount {

    @Id
    @NotNull
    @Length(min = 20, max = 20)
    private String number;

    @ManyToOne(optional = false)
    private Bank bank;

    @ManyToOne(optional = false)
    private Partner owner;
}
