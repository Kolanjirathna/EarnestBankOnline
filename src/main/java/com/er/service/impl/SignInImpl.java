package com.er.service.impl;


import com.er.dto.LoginDTO;
import com.er.entity.SignInPage;
import com.er.repository.SignInRepo;
import com.er.responseload.LoginResponse;
import com.er.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SignInImpl implements SignInService {
    @Autowired
    private SignInRepo signInRepo;


    @Override
    public String saveUser(SignInPage signInPage) {

        signInRepo.save(signInPage);
        return "Success";
    }


    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        LoginDTO employee1 =  null;  // signInRepo.findByEmail(loginDTO.getLoginName());
        if (employee1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = employee1.getPassword();
            System.out.println("Password" + encodedPassword);
            //Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (password != null) {
                Optional<LoginDTO> employee = signInRepo.findOneByEmailAndPassword(loginDTO.getLoginName(), encodedPassword);
                if (employee.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("password Not Match", false);
            }
        } else {
            return new LoginResponse("Email not exits", false);
        }
    }

}
