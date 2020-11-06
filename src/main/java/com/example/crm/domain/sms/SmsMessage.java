package com.example.crm.domain.sms;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "sms_messages")
@Data
public class SmsMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(min = 1)
    private String text;

    @NotNull
    private String phone;

    @NotNull
    private String uuid;

    @NotNull
    private String sender;

    @CreationTimestamp
    private Date createdAt;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SmsMessageStatus status;

    private Date sendAt;

    private Date deliveredAt;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SmsProviderType provider;

    @ManyToOne
    private SmsOperator operator;

    @NotNull
    @PositiveOrZero
    private BigDecimal price;
}
