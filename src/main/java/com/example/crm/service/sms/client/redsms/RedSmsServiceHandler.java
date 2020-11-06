package com.example.crm.service.sms.client.redsms;

import com.example.crm.domain.sms.SmsProviderType;
import com.example.crm.service.sms.SmsServiceChain;
import com.example.crm.service.sms.SmsServiceHandler;
import com.example.crm.service.sms.client.SmsApiClientService;
import com.example.crm.service.sms.client.SmsMessageDTO;
import com.example.crm.service.sms.client.SmsSendParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedSmsServiceHandler implements SmsServiceHandler {

    private final SmsApiClientService redSmsApiService;

    @Override
    public SmsMessageDTO handle(SmsProviderType providerType, SmsSendParams params, SmsServiceChain chain) {
        if (providerType == SmsProviderType.REDSMS) {
            return redSmsApiService.send(params);
        }

        return chain.doSend(providerType, params);
    }
}
