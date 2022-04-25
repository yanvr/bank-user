package com.letscode.bankuser.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UpdateUserNameRequest {

    @NotBlank
    private String name;
}
