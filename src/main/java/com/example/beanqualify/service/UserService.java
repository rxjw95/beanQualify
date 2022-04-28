package com.example.beanqualify.service;

import com.example.beanqualify.controller.SignUpDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final MailService mailService;

    public UserService(MailService mailService) {
        this.mailService = mailService;
    }

    public String createUser(SignUpDto signUpDto) {
        // ... create user
        return mailService.sendEmail(signUpDto.getEmail());
    }
}
