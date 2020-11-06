package com.example.crm.service.sms;

import com.example.crm.domain.sms.SmsProviderType;
import com.example.crm.service.sms.client.SmsMessageDTO;
import com.example.crm.service.sms.client.SmsSendParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@RequiredArgsConstructor
public class SmsServiceChain {

    private final SmsServiceHandler[] smsServices;

    private int currentHandlerIndex = 0;

    public SmsMessageDTO doSend(SmsProviderType providerType, SmsSendParams params) {
        try {
            if (smsServices.length < currentHandlerIndex) {
                return smsServices[currentHandlerIndex++].handle(providerType, params, this);
            } else {
                throw new RuntimeException("Sms service handler not found");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("Can't send sms by provider" + providerType, e);
        }
    }
}