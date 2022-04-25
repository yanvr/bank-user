package com.letscode.bankuser.service;

import com.letscode.bankuser.dto.UpdateUserNameRequest;
import com.letscode.bankuser.dto.UserInfo;
import com.letscode.bankuser.dto.UserRequest;
import com.letscode.bankuser.dto.UserResponse;

public interface UserService {

    UserResponse save(UserRequest userRequest);

    UserResponse findById(Long id);

    UserResponse update(Long id, UpdateUserNameRequest updateUserNameRequest);

    UserInfo findByIdClient(Long id);
}
