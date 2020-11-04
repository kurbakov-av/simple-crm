package com.example.crm.service.sms.redsms.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RedSmsMessage {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("parentUUid")
    private String parentUuid;

    @JsonProperty("childUuid")
    private String childUuid;

    @JsonProperty("status")
    private RedSmsMessageStatus status;

    @JsonProperty("status_time")
    private String statusTime;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("create_time")
    private String createTime;

    @JsonProperty("to")
    private String to;

    @JsonProperty("text")
    private String text;

    @JsonProperty("country")
    private String country;

    @JsonProperty("operator")
    private String operator;

    @JsonProperty("price")
    private String price;

    @JsonProperty("from")
    private String from;

    @JsonProperty("parts")
    private String parts;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("source")
    private String source;

    @JsonProperty("created")
    private String created;

    @JsonProperty("sended")
    private String sended;

    @JsonProperty("last_answer")
    private String lastAnswer;

    @JsonProperty("answers")
    private String answers;

    @JsonProperty("provider_status")
    private String providerStatus;

    @JsonProperty("meta_data")
    private String metaData;
}
