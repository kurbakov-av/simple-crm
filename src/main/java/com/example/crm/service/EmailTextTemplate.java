package com.example.crm.service;

import com.example.crm.domain.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class EmailTextTemplate {

    private final TextTemplateEngine templateEngine;

    public String sayHello(Contact contact) {
        return templateEngine.interpret("templates.email.hello", Map.of("name", contact.getContactName()));
    }
}
