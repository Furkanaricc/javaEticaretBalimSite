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
public class CreateProductRequest {
    @NotBlank
    @NotNull
    @Size(min=2,max=45)
    public String name;

}
