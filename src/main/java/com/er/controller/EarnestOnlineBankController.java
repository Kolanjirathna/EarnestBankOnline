package com.er.controller;

import com.er.dto.LoginDTO;

import com.er.dto.SignInDTO;
import com.er.entity.SignInPage;
import com.er.responseload.LoginResponse;
import com.er.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/bank")
public class EarnestOnlineBankController {
    @Autowired
    private SignInService signInService;
    @PostMapping(path="/save", consumes = "application/json")
    public String saveUser(@RequestBody SignInPage signInPage)
    {
        return signInService.saveUser(signInPage);

    }
    @PostMapping("/login")
    public ResponseEntity<String> loginEmployee(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = signInService.loginUser(loginDTO);
        return new ResponseEntity(loginResponse, HttpStatus.OK);
    }
}
