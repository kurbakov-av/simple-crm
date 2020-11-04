package com.example.crm.service.sms.redsms;

import com.example.crm.domain.sms.provider.SmsProvider;
import com.example.crm.domain.sms.provider.SmsProviderRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class RedSmsClient extends RestTemplate {

    private final SmsProviderRepository smsProviderRepository;

    public RedSmsClient(SmsProviderRepository smsProviderRepository) {
        this.smsProviderRepository = smsProviderRepository;
        getInterceptors().add(createAuthInterceptor());
    }

    private ClientHttpRequestInterceptor createAuthInterceptor() {
        return (httpRequest, bytes, clientHttpRequestExecution) -> {
            SmsProvider provider = smsProviderRepository.findByName("redsms");
            String uuid = UUID.randomUUID().toString();

            HttpHeaders headers = httpRequest.getHeaders();
            headers.add("login", provider.getLogin());
            headers.add("ts", uuid);
            headers.add("secret", uuid.concat(provider.getPassword()));

            return clientHttpRequestExecution.execute(httpRequest, bytes);
        };
    }
}
