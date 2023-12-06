package com.deploydesexta.imersao16.domain;

public sealed interface Password permits PlainTextPassword, SHA1Password, PBKDF2Password {

    String value();

    boolean validate(String password);
}