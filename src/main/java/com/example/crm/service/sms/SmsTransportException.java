package com.example.crm.service.sms;

import com.example.crm.domain.sms.SmsProviderType;

public class SmsTransportException extends RuntimeException {

    public SmsTransportException(SmsProviderType providerType) {
        this(providerType, null);
    }

    public SmsTransportException(SmsProviderType providerType, Throwable cause) {
        super("Can't send sms by provider: " + providerType, cause);
    }
}
