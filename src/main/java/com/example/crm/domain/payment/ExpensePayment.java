package com.example.crm.domain.payment;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_expenses")
@Data
@EqualsAndHashCode(callSuper = true)
public class ExpensePayment extends Payment {
}
