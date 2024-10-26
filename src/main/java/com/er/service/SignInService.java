package com.er.service;


import com.er.dto.LoginDTO;
import com.er.entity.SignInPage;
import com.er.responseload.LoginResponse;


public interface SignInService {
    String saveUser(SignInPage signInPage);
    LoginResponse loginUser(LoginDTO loginDTO);
}
