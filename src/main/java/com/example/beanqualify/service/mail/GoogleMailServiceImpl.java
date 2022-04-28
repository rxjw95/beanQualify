package com.example.beanqualify.service.mail;

import com.example.beanqualify.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class GoogleMailServiceImpl implements MailService {

    @Override
    public String sendEmail(String email) {
        return "Send google mail to" + email;
    }

}
