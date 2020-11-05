package com.example.crm.domain.payment;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_incomes")
@Data
@EqualsAndHashCode(callSuper = true)
public class IncomePayment extends Payment {
}
