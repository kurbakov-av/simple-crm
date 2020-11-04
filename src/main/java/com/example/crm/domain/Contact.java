package com.example.crm.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Embeddable
public class Contact {

    @NotNull
    private String contactName;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(unique = true)
    private String phone;

    @Column(unique = true)
    private String skype;

    @Column(unique = true)
    private String icq;

    @Email(regexp = ".+@.+")
    @Column(unique = true)
    private String email;

    @Pattern(regexp = "^(https?://)?(www\\.)?([a-zA-Z0-9]+(-?[a-zA-Z0-9])*\\.)+[\\w]{2,}(/\\S*)?$")
    private String site;

    public enum Type {
        HOME, WORK;
    }
}
