package com.example.crm.service.email;

import lombok.Data;

@Data
public class EmailSendParams {
    private final String subject;
    private final String addressed;
    private final String body;
}
