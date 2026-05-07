package com.example.test.service;


import com.example.test.dto.enums.Purpose;

public interface EmailService {
    void send(String email, String code, String title, Purpose purpose);
}
