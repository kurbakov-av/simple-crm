package com.example.crm.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.util.List;

@Data
@Embeddable
public class Requisites {

    private String legalAddress;

    private String mailAddress;

    @Length(min = 10, max = 12)
    private String inn;

    @Length(min = 9, max = 9)
    private String kpp;

    @Length(min = 13, max = 13)
    private String ogrn;

    @Length(min = 8, max = 10)
    private String okpo;

    @ElementCollection
    @CollectionTable(name = "okvd_codes")
    private List<String> okvdList;
}
