package com.example.crm.service.sms.client.redsms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RedSmsError {

    @JsonProperty("to")
    private String to;

    @JsonProperty("message")
    private String message;
}
