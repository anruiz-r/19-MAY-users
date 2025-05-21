package com.ironhack.users_micro.dto;

import com.ironhack.users_micro.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {                                        

    private Long id;
    private String username;
    private Long accountID;
    private AccountDTO acount;

    public AccountResponseDTO(User user, AccountDTO accountDTO){
        setId(user.getId());
        setUsername(user.getUsername());
        setAccountID(user.getAccountID());
        setAcount(acount);
    }
}
