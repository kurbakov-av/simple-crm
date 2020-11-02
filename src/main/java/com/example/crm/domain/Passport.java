package com.example.crm.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Embeddable
public class Passport {

    @NotNull
    private String fullName;

    @NotNull
    private Date birthday;

    @NotNull
    private String legalAddress;

    @NotNull
    private String divisionCode;

    @NotNull
    @Length(min = 4, max = 4)
    private String serial;

    @NotNull
    @Length(min = 6, max = 6)
    private String number;

    @NotNull
    private String issuedBy;

    @NotNull
    private Date issuedAt;
}
