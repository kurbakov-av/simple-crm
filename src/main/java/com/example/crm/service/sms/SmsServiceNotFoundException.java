package com.example.crm.service.sms;

import com.example.crm.domain.sms.SmsProviderType;

public class SmsServiceNotFoundException extends RuntimeException {

    public SmsServiceNotFoundException(SmsProviderType providerType) {
        super("Sms service handler not found: " + providerType);
    }
}
