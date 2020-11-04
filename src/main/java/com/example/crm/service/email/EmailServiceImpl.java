package com.example.crm.service.email;

import com.example.crm.domain.Contact;
import com.example.crm.domain.employer.Employer;
import com.example.crm.service.EmployerService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    private final EmployerService employerService;

    @Override
    public void send(EmailSendParams params) {
        Employer currentEmployer = employerService.current();
        Contact contact = currentEmployer.getDefaultContact();
        if (contact.getEmail() == null) {
            throw new IllegalArgumentException("Email not set for current employer");
        }

        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(params.getSubject());
        message.setFrom(contact.getEmail());
        message.setTo(params.getAddressed());
        message.setText(params.getBody());

        mailSender.send(message);
    }
}
