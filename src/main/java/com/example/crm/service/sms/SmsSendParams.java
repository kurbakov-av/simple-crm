package com.example.crm.service.sms;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

@Data
@Builder
public class SmsSendParams {

    @NonNull
    private final String sender;

    @NonNull
    private final String text;

    @NonNull
    @Singular
    private final List<String> phones;

    private final Boolean convertToTransliteration;

    private final Integer timeValidity;
}
