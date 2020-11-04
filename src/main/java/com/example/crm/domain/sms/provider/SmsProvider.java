package com.example.crm.domain.sms.provider;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sms-providers")
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsProvider extends Catalog {
    private String login;
    private String password;
}
