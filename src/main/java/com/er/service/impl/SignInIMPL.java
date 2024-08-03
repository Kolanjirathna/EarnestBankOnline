package com.er.service.impl;


import com.er.dto.LoginDTO;
import com.er.dto.SignInDTO;


import com.er.repository.SignInRepo;
import com.er.responseload.LoginResponse;
import com.er.service.SignInService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Service
public class SignInIMPL implements SignInService {
    @Autowired
    private SignInRepo signInRepo;
    //@Autowired
    // private PasswordEncoder passwordEncoder;
    @Column(name = "employee_name", length = 255)
    private String employeename;
    @Column(name = "email", length = 255)
    private String email;
    @Column(name = "password", length = 255)
    private String password;

    @Override
    public String addEmployee(SignInDTO signInDTO) {
       /* SignInDTO signInDTOsave = new SignInDTO(
                signInDTOsave.getAddress(),
                signInDTOsave.getAge(),
                signInDTOsave.getEmail(),
                signInDTOsave.getPassword()
               // this.passwordEncoder.encode(employeeDTO.getPassword())
        );*/
        signInRepo.save(signInDTO);
        return signInDTO.getName();
    }

    //EmployeeDTO employeeDTO;

    @Override
    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        String msg = "";
        LoginDTO employee1 = signInRepo.findByEmail(loginDTO.getLoginName());
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
