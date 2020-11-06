package com.example.crm.service;

import com.example.crm.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DomainUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findByUsernameOrEmail(s, s)
                .map(e -> new User(e.getUsername(), e.getPassword(), e.getAuthorities()))
                .orElseThrow(() -> new UsernameNotFoundException("Employer not found by: " + s));
    }
}
