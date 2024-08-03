package com.er.service;


import com.er.dto.EmployeeDTO;
import com.er.dto.LoginDTO;
import com.er.responseload.LoginResponse;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}
