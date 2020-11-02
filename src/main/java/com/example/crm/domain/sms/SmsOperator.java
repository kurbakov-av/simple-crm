package com.example.crm.domain.sms;

import com.example.crm.domain.Catalog;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sms_operators")
@Data
@EqualsAndHashCode(callSuper = true)
public class SmsOperator extends Catalog {
}
