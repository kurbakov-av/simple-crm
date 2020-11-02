package com.example.crm.domain.bank;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.money.BankAccount;
import com.example.crm.domain.partner.Partner;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "banks")
@Data
@EqualsAndHashCode(callSuper = true)
public class Bank extends Catalog {

    @ManyToOne(optional = false)
    private Partner partner;

    @NotNull
    @Length(min = 9, max = 9)
    private String bik;

    @ManyToOne(optional = false)
    private BankAccount correspondentAccount;

    @Data
    @Embeddable
    public static class License {

        @NotNull
        private String number;

        @NotNull
        private Date issuedAt;

        @NotNull
        private String name;
    }
}
