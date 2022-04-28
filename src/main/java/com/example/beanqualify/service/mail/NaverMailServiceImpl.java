package com.example.beanqualify.service.mail;

import com.example.beanqualify.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class NaverMailServiceImpl implements MailService {

    @Override
    public String sendEmail(String email) {
        return "Send naver mail to " + email;
    }

}
