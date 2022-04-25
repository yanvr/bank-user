package com.letscode.bankuser.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id) {
        super("Don't exists a user with id: " + id);
    }
}
