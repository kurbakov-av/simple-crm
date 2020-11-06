package com.example.crm.service.sms.client.redsms;

import com.example.crm.domain.sms.SmsMessageStatus;
import com.example.crm.service.sms.client.SmsApiClientService;
import com.example.crm.service.sms.client.SmsMessageDTO;
import com.example.crm.service.sms.client.SmsSendParams;
import com.example.crm.service.sms.client.redsms.model.RedSmsInfoMessageResponse;
import com.example.crm.service.sms.client.redsms.model.RedSmsMessage;
import com.example.crm.service.sms.client.redsms.model.RedSmsMessageStatus;
import com.example.crm.service.sms.client.redsms.model.RedSmsSendMessageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RedSmsApiService implements SmsApiClientService {

    private final RestOperations redsmsClient;

    @Override
    public SmsMessageDTO send(SmsSendParams params) {
        Map<String, String> paramMap = new LinkedHashMap<>();
        paramMap.put("route", "sms");
        paramMap.put("from", params.getSender());
        paramMap.put("text", params.getText());
        paramMap.put("to", params.getPhones().get(0));

        if (Boolean.TRUE.equals(params.getConvertToTransliteration())) {
            paramMap.put("translit ", "");
        }

        Integer timeValidity = params.getTimeValidity();
        if (timeValidity != null && timeValidity > 0) {
            paramMap.put("validity", timeValidity.toString());
        }

        ResponseEntity<RedSmsSendMessageResponse> response = redsmsClient.postForEntity(
                "/message", paramMap, RedSmsSendMessageResponse.class);

        RedSmsSendMessageResponse body = extractBody(response);
        if (body.getItems() != null) {
            List<RedSmsSendMessageResponse.Item> items = response.getBody().getItems();
            return info(items.get(0).getUuid());
        }

        throw new RuntimeException();
    }

    @Override
    public SmsMessageDTO info(String uuid) {
        ResponseEntity<RedSmsInfoMessageResponse> response = redsmsClient.getForEntity(
                "/message/{uuid}", RedSmsInfoMessageResponse.class, Map.of("uuid", uuid));

        RedSmsMessage body = extractBody(response).getItems().get(0);

        SmsMessageDTO dto = new SmsMessageDTO();
        dto.setUuid(body.getUuid());
        dto.setSender(body.getFrom());
        dto.setText(body.getText());
        dto.setPhone(body.getTo());
        dto.setOperator(body.getOperator().toLowerCase());
        dto.setPrice(body.getPrice());
        dto.setStatus(parseStatus(body.getStatus()));
        if (dto.getStatus() == SmsMessageStatus.DELIVERED) {
            LocalDateTime deliveredAt = LocalDateTime.parse(body.getStatusTime());
            dto.setDeliveredAt(deliveredAt);
        }

        return dto;
    }

    private <T> T extractBody(ResponseEntity<T> response) {
        if (response.getStatusCode().is2xxSuccessful() && response.hasBody()) {
            return response.getBody();
        }

        throw new RuntimeException("Body not exist");
    }

    private SmsMessageStatus parseStatus(RedSmsMessageStatus status) {
        switch (status) {
            case PROGRESS:
                return SmsMessageStatus.SEND;
            case MODERATION:
                return SmsMessageStatus.MODERATION;
            case DELIVERED:
                return SmsMessageStatus.DELIVERED;
            case REJECT:
                return SmsMessageStatus.REJECT;
            default:
                return SmsMessageStatus.UNDELIVERED;
        }
    }
}
