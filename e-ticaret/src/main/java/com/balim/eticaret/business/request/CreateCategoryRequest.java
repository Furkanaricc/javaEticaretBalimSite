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
public class CreateCategoryRequest {
    @NotBlank
    @NotNull
    @Size(min=2,max=30)
    private String categoryName;
}
