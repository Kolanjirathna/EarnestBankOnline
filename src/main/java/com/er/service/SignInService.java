package com.er.service;



import com.er.dto.LoginDTO;
import com.er.dto.SignInDTO;
import com.er.responseload.LoginResponse;


public interface SignInService {
    String addEmployee(SignInDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}
