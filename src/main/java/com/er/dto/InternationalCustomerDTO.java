package com.er.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InternationalCustomerDTO {
    private String currencyCategort;
    private String currencyConvertTo;
    private Long totalAmount;
    long amountAfterConversion;
}
