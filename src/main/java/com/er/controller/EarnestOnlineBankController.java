package com.er.controller;




import com.er.dto.LoginDTO;

import com.er.dto.SignInDTO;
import com.er.responseload.LoginResponse;
import com.er.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EarnestOnlineBankController {
    @Autowired
    private SignInService employeeService;
    @PostMapping(path="/save", consumes = "application/json")
    public String saveEmployee(@RequestBody SignInDTO employeeDTO)
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
