package com.er.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "accountdetails")
public class Account {
    @Id
    @Column(name = "AccountNo")
    private long accountNo;
    @Column(name = "AccountCategory")
    private String accountCategory;
    @Column(name = "AccountHolderName")
    private String accountHolderName;
    @Column(name = "ACStartDate")
    private Date accountStartDate;
    @Column(name = "accountEndDate")
    private Date accountEndDate;
    @Column(name = "State")
    private String State;
    @Column(name = "AccountNo")
    private Long adharNo;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;
    @Column(name = "panNo")
    private String panNo;
    @Column(name = "Mailid")
    private String mailId;
    @Column(name = "Phone")
    private Long phoneNumber;
}
