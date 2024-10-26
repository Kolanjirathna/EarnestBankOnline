package com.er.entity;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "signinpage")
public class SignInPage {
    @Id
    int id;
    @Column(name ="login")
    private String login;
    @Column(name ="password")
    private String password;
    @Column(name ="name")
    private String name;
    @Column(name ="email", length = 255)
    private String email;
    @Column(name ="address", length = 255)
    private String address;
    @Column(name ="phone", length = 255)
    private String phone;
    @Column(name ="occupation", length = 255)
    private String occupation;
    @Column(name ="age", length = 255)
    private int age;
    @Column(name ="identity", length = 255)
    private String identity;
    @Column(name ="sex", length = 255)
    private String sex;
    @Column(name ="lastupdate", length = 255)
    private Date lastupdate;
}
