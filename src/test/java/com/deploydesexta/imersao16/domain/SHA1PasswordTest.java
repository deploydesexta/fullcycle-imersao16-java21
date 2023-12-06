package com.deploydesexta.imersao16.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SHA1PasswordTest {

    @Test
    public void deveriaHashearASenha() {

        var password = SHA1Password.create("123456");

        Assertions.assertNotEquals("123456", password.value());
    }

    @Test
    public void deveriaDarMatchNasSenhas() {

        var password = SHA1Password.create("123456");

        Assertions.assertTrue(password.validate("123456"));
    }
}