package com.er.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InternationalCustomer {
    private String currencyCategort;
    private String currencyConvertTo;
    private Long totalAmount;
    long amountAfterConversion;
}