package com.balim.eticaret.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    @NotBlank
    @NotNull
    @Size(min=2,max=20)
    public String firstName;
    @NotBlank
    @NotNull
    @Size(min=2,max=20)
    public String secondName;
    @NotBlank
    @NotNull
    @Size(min=2,max=90)
    public String userAddress;
    @NotBlank
    @NotNull
    @Size(min=2,max=40)
    public String eMail;
}
