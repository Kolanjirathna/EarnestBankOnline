package com.er.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "SignInPage")
@Setter
@Getter
@NoArgsConstructor
public class SignInPage {
    @Id

    @Column(name = "LoginId", length = 45)
    private String loginId;
    @Column(name = "Password", length = 255)
    private String Password;
    @Column(name = "Name", length = 255)
    private String Name;
    @Column(name = "Email", length = 255)
    private String Email;
    @Column(name = "Email", length = 255)
    private String Address;
    @Column(name = "Phone", length = 255)
    private String Phone;
    @Column(name = "Occupation", length = 255)
    private String Occupation;
    @Column(name = "Age", length = 255)
    private int Age;
    @Column(name = "AnnualIncome", length = 255)
    private int AnnualIncome;
    @Column(name = "Identity", length = 255)
    private String Identity;
    @Column(name = "Sex", length = 255)
    private String Sex;
    @Column(name = "LastUpdate", length = 255)
    private Date LastUpdate;
}
