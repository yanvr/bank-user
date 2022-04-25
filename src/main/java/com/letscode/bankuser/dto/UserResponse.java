package com.letscode.bankuser.dto;

import com.letscode.bankuser.model.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponse {

    private Long id;
    private String name;
    private String cpf;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.creationDate = user.getCreationDate();
        this.updateDate = user.getUpdateDate();
    }
}
