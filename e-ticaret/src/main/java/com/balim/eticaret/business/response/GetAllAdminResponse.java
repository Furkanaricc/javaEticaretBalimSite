package com.balim.eticaret.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class GetAllAdminResponse {
    private int adminId;
    private String adminName;


}
