package com.er.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table (name="userlogin")
@Setter
@Getter
@NoArgsConstructor
public class Login {
    @Id
    @Column(name = "LoginId")
    private String  LoginId ;
    @Id
    @Column(name = "Password")
    private String Password;
    @Id
    @Column(name = "LastUpdate")
    private Date LastUpdate;


}
