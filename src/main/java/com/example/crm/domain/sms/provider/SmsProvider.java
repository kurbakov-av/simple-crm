package com.example.crm.domain.sms.provider;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.sms.SmsProviderType;
import com.example.crm.domain.sms.SmsSender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "sms-providers")
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsProvider extends Catalog {

    @NotNull
    private String login;

    @NotNull
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SmsProviderType providerType;

    @ManyToOne(optional = false)
    private SmsSender defaultSender;

    @OneToMany(mappedBy = "provider", orphanRemoval = true)
    private List<SmsSender> senders;
}
