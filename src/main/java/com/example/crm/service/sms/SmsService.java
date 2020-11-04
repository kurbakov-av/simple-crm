package com.example.crm.service.sms;

public interface SmsService {
    SmsMessageDTO send(String phone, SmsSendParams params);

    SmsMessageDTO info(String uuid);
}
