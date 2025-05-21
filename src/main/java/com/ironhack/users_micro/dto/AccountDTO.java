package com.ironhack.users_micro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AccountDTO {
    private Long id;
    private String iban;
    private BigDecimal balance;
}
