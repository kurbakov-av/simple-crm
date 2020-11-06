package com.example.crm.service.sms;

import com.example.crm.domain.Contact;

public interface SmsService {
    void send(Contact contact, String text);
}
