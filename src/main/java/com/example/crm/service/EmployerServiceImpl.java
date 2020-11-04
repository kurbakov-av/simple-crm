package com.example.crm.service;

import com.example.crm.domain.employer.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployerServiceImpl implements EmployerService {

    @Override
    public Employer current() {
        return null;
    }
}
