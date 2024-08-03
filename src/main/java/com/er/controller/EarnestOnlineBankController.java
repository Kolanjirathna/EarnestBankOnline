package com.er.controller;



import com.er.dto.EmployeeDTO;
import com.er.dto.LoginDTO;

import com.er.responseload.LoginResponse;
import com.er.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EarnestOnlineBankController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping(path="/save", consumes = "application/json")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        String id = employeeService.addEmployee(employeeDTO);
        return id;
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = employeeService.loginEmployee(loginDTO);
        return new ResponseEntity(loginResponse, HttpStatus.OK);
    }
}
