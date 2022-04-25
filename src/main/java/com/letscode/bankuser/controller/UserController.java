package com.letscode.bankuser.controller;

import com.letscode.bankuser.dto.UserInfo;
import com.letscode.bankuser.dto.UserRequest;
import com.letscode.bankuser.dto.UserResponse;
import com.letscode.bankuser.dto.UpdateUserNameRequest;
import com.letscode.bankuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserResponse save(@RequestBody @Valid UserRequest userRequest) {
        return userService.save(userRequest);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public UserResponse findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/client/{id}")
    public UserInfo findByIdClient(@PathVariable Long id) {return userService.findByIdClient(id);}

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{id}")
    public UserResponse updateName(@PathVariable Long id, @Valid @RequestBody UpdateUserNameRequest updateUserNameRequest) {
        return userService.update(id, updateUserNameRequest);
    }
}
