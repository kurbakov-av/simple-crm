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
            if (currentHandlerIndex < smsServices.length) {
                return smsServices[currentHandlerIndex++].handle(providerType, params, this);
            } else {
                throw new SmsServiceNotFoundException(providerType);
            }
        } catch (RuntimeException e) {
            throw new SmsTransportException(providerType, e);
        }
    }
}
