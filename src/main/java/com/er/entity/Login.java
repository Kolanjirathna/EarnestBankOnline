package com.er.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.Date;

@Entity
@Table (name="userlogin")

public class Login {
    @Id
    @Column(name = "LoginId")
    private String  loginId ;
    @Id
    @Column(name = "Password")
    private String password;
    @Id
    @Column(name = "LastUpdate")
    private Date LastUpdate;


}
