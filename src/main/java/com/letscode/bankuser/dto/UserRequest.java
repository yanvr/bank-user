package com.letscode.bankuser.dto;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;

@Data
public class UserRequest {

    @NotBlank
    private String name;

    @NotBlank
    @CPF
    private String cpf;

}
