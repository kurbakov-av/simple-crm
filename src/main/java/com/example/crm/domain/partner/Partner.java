package com.example.crm.domain.partner;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.Contact;
import com.example.crm.domain.money.BankAccount;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode(callSuper = true)
public abstract class Partner extends Catalog {

    @ManyToOne
    private SourceRequest sourceRequest;

    private String actualAddress;

    @NotNull
    private Contact defaultContact;

    @ElementCollection
    @CollectionTable(name = "contacts")
    private List<Contact> contacts;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<BankAccount> bankAccounts;
}
