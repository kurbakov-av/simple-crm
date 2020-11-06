package com.example.crm.service.sms.client;

import com.example.crm.domain.sms.SmsMessageStatus;
import com.example.crm.domain.sms.SmsProviderType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SmsMessageDTO {
    private String uuid;
    private String sender;
    private String text;
    private String phone;
    private SmsMessageStatus status;
    private LocalDateTime deliveredAt;
    private String operator;
    private String price;
    private SmsProviderType providerType;
}
