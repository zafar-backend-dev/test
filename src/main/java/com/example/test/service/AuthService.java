package com.example.test.service;

//import uz.zafar.onlineshoptelegrambot.dto.ResponseDto;
//import uz.zafar.onlineshoptelegrambot.dto.auth.*;
//import uz.zafar.onlineshoptelegrambot.dto.auth.response.TokenResponse;

import com.example.test.dto.ResponseDto;
import com.example.test.dto.auth.*;
import com.example.test.dto.auth.response.TokenResponse;

public interface AuthService {
    ResponseDto<Void> signIn(LoginForm form);

    ResponseDto<TokenResponse> verifySignIn(SignInVerifyRequest request);

    ResponseDto<Object> signUp(SignUpRequest request);

    ResponseDto<TokenResponse> verifySignUp(SignUpVerifyRequest request);

    ResponseDto<Object> forgotPassword(ForgotPasswordRequest request);

    ResponseDto<Object> resetPassword(ResetPasswordRequest request);
}
