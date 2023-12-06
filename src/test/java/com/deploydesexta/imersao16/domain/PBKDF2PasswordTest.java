package com.deploydesexta.imersao16.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PBKDF2PasswordTest {

    @Test
    public void deveriaHashearASenha() {

        var password = PBKDF2Password.create("123456");

        Assertions.assertNotEquals("123456", password.value());
        Assertions.assertTrue(password.value().contains("$$".concat(password.salt())));
    }

    @Test
    public void deveriaDarMatchNasSenhas() {

        var password = PBKDF2Password.create("123456");

        Assertions.assertTrue(password.validate("123456"));
    }
}