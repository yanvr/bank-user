package com.letscode.bankuser.service.impl;

import com.letscode.bankuser.dto.UpdateUserNameRequest;
import com.letscode.bankuser.dto.UserInfo;
import com.letscode.bankuser.dto.UserRequest;
import com.letscode.bankuser.dto.UserResponse;
import com.letscode.bankuser.enums.UserStatus;
import com.letscode.bankuser.exception.UserNotFoundException;
import com.letscode.bankuser.model.User;
import com.letscode.bankuser.repository.UserRepository;
import com.letscode.bankuser.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse save(UserRequest userRequest) {
        User user = new User(userRequest);
        User savedUser = userRepository.save(user);
        return new UserResponse(savedUser);
    }

    @Override
    public UserResponse findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return new UserResponse(user);
    }

    @Override
    public UserInfo findByIdClient(Long id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);

        var user = userRepository.existsById(id);

        if (user) {
            userInfo.setUserStatus(UserStatus.CREATED);
        } else {
            userInfo.setUserStatus(UserStatus.NOT_CREATED);
        }

        return userInfo;
    }

    @Override
    public UserResponse update(Long id, UpdateUserNameRequest updateUserNameRequest) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        User updatedUser = userRepository.save(user);
        return new UserResponse(updatedUser);
    }

}
