package com.deploydesexta.imersao16.infrastructure.dtos;

import com.deploydesexta.imersao16.domain.PasswordType;

public record CreateUserInput(String email, PasswordType passwordType, String password) {
}
