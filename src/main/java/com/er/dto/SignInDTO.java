package com.er.dto;


public class SignInDTO {

    private String login;
    private String password;
    private String name;
    private String email;
    private String address;
    private Long phoneNumber;
    private int age;
    private Long annualIncome;
    private String Identity;
    private String sex;
    @Override
    public String toString() {
        return "SignInDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", annualIncome=" + annualIncome +
                ", Identity='" + Identity + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
    public SignInDTO(String login, String password, String name, String email, String address, Long phoneNumber, int age, Long annualIncome, String identity, String sex) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.annualIncome = annualIncome;
        Identity = identity;
        this.sex = sex;
    }
}
