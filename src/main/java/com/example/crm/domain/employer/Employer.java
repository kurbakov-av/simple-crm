package com.example.crm.domain.employer;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.Contact;
import com.example.crm.domain.Passport;
import com.example.crm.domain.department.Department;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "employers")
@Data
@EqualsAndHashCode(callSuper = true)
public class Employer extends Catalog {

    @ManyToOne(optional = false)
    private Position position;

    @Embedded
    private Passport passport;

    @NotNull
    @Embedded
    private Contact defaultContact;

    @ElementCollection
    @CollectionTable(name = "employer_contacts")
    private List<Contact> contacts;

    @ManyToOne(optional = false)
    private Department department;
}
