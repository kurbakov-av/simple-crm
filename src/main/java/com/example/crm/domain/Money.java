package com.example.crm.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Currency;

@Data
@Embeddable
public class Money {

    @NotNull
    @PositiveOrZero
    private BigDecimal value;

    @NotNull
    @org.hibernate.validator.constraints.Currency(value = {"RUB"})
    private Currency currency;
}
