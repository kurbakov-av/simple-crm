package com.example.crm.service.sms.client;

public interface SmsApiClientService {
    SmsMessageDTO send(SmsSendParams params);

    SmsMessageDTO info(String uuid);
}
