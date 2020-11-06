package com.example.crm.service.sms.client.redsms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class RedSmsSendMessageResponse {

    @JsonProperty("count")
    private int count;

    @JsonProperty("success")
    private boolean success;

    @JsonProperty("items")
    private List<Item> items;

    @Getter
    public static class Item {

        @JsonProperty("to")
        private String to;

        @JsonProperty("uuid")
        private String uuid;
    }
}
