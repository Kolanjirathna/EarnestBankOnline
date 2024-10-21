package com.er.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="")
public class Account {
    private long accountNumber;
    private String accountCategory;
    private String accountHolderName;
    private Date accountStartDate;
    private Date accountEndDate;
}
