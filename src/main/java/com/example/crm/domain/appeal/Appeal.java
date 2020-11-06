package com.example.crm.domain.appeal;

import com.example.crm.domain.Contact;
import com.example.crm.domain.Document;
import com.example.crm.domain.partner.SourceRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "appeals")
@Data
@EqualsAndHashCode(callSuper = true)
public class Appeal extends Document {

    @ManyToOne(optional = false)
    private SourceRequest sourceRequest;

    @NotNull
    @Embedded
    private Contact contact;

    private String message;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AppealChannel appealChannel;
}
