package com.balim.eticaret.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserResponse {
    private int userId;
    private String firstName;
    private String secondName;
    private String userAddress;
    private String eMail;
}
