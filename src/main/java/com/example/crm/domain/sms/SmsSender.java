package com.example.crm.domain.sms;

import com.example.crm.domain.Catalog;
import com.example.crm.domain.sms.provider.SmsProvider;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "sms_senders")
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsSender extends Catalog {

    @ManyToOne(optional = false)
    private SmsProvider provider;

    @NotNull
    @Length(min = 1)
    private String sign;

    private boolean active;
}
