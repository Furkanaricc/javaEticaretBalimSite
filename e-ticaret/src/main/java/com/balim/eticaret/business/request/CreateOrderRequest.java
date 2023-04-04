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
public class CreateOrderRequest {
    @NotBlank
    @NotNull
    @Size(min=2,max=30)
    public Long orderNumber;


    @NotBlank
    @NotNull
    @Size(min=2,max=40)
    public int shippingCost;
}
