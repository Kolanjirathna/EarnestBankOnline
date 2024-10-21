package com.er.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class AccountdDTO {
    private long accountNumber;
    private String accountCategory;
    private String accountHolderName;
    private Date accountStartDate;
    private Date accountEndDate;
}
