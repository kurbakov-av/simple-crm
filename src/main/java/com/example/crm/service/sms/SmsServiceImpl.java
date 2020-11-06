package com.example.crm.service.sms;

import com.example.crm.domain.Contact;
import com.example.crm.domain.sms.SmsMessage;
import com.example.crm.domain.sms.SmsMessageRepository;
import com.example.crm.domain.sms.SmsOperatorRepository;
import com.example.crm.domain.sms.provider.SmsProvider;
import com.example.crm.domain.sms.provider.SmsProviderRepository;
import com.example.crm.service.sms.client.SmsMessageDTO;
import com.example.crm.service.sms.client.SmsSendParams;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SmsServiceImpl implements SmsService {

    private final SmsServiceChain smsServiceChain;

    private final SmsProviderRepository smsProviderRepository;

    private final SmsMessageRepository smsMessageRepository;

    private final SmsOperatorRepository smsOperatorRepository;

    @Override
    @Transactional
    public void send(Contact contact, String text) {
        Exception lastException = null;
        List<SmsProvider> providers = smsProviderRepository.findAll();
        for (SmsProvider provider : providers) {
            SmsSendParams smsParams = SmsSendParams.builder()
                    .phone(contact.getPhone())
                    .text(text)
                    .sender(provider.getDefaultSender().getSign())
                    .build();

            try {
                SmsMessage message = smsMessageRepository.save(new SmsMessage());
                SmsMessageDTO dto = smsServiceChain.doSend(provider.getProviderType(), smsParams);

                smsOperatorRepository.findByName(dto.getOperator()).ifPresent(message::setOperator);
                message.setUuid(dto.getUuid());
                message.setSender(dto.getSender());
                message.setText(dto.getText());
                message.setPhone(dto.getPhone());
                message.setPrice(new BigDecimal(dto.getPrice()));
                message.setStatus(dto.getStatus());
                message.setProvider(provider.getProviderType());
                message.setDeliveredAt(Date.from(dto.getDeliveredAt().toInstant(ZoneOffset.UTC)));

                smsMessageRepository.save(message);
            } catch (RuntimeException e) {
                lastException = e;
            }
        }

        // TODO set message
        throw new RuntimeException(lastException);
    }
}
