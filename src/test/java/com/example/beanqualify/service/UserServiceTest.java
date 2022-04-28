package com.example.beanqualify.service;

import com.example.beanqualify.controller.SignUpDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService subject;

    @Test
    void 필드명으로_빈을_식별한다() {
        SignUpDto userDto = SignUpDto.builder()
                .name("woogie")
                .email("rxjw95@gmail.com")
                .build();

        String response = subject.createUser(userDto);

        assertEquals(response, "Send naver mail to rxjw95@gmail.com");

    }

}