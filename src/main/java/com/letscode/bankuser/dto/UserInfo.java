package com.letscode.bankuser.dto;

import com.letscode.bankuser.enums.UserStatus;
import lombok.Data;

@Data
public class UserInfo {

    private Long id;
    private UserStatus userStatus;
}
