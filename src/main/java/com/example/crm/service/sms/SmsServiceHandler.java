package com.example.crm.service.sms;

import com.example.crm.domain.sms.SmsProviderType;
import com.example.crm.service.sms.client.SmsMessageDTO;
import com.example.crm.service.sms.client.SmsSendParams;

public interface SmsServiceHandler {
    SmsMessageDTO handle(SmsProviderType providerType, SmsSendParams params, SmsServiceChain chain);
}
