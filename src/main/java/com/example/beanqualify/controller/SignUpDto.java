package com.example.beanqualify.controller;

import lombok.Builder;
import lombok.Getter;

@Getter
public class SignUpDto {

    private String name;
    private String email;

    @Builder
    public SignUpDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
