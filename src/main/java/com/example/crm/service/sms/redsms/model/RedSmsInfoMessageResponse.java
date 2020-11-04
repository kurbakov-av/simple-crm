package com.example.crm.service.sms.redsms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class RedSmsInfoMessageResponse {

    @JsonProperty("items")
    private List<RedSmsMessage> items;
}
