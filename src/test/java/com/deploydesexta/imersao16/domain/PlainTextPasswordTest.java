package com.deploydesexta.imersao16.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlainTextPasswordTest {

    @Test
    public void deveriaCriarUmPlainPassword() {

        final var expectedPassword = "123456";

        final var password = new PlainTextPassword(expectedPassword);

        Assertions.assertTrue(password.validate(expectedPassword));
    }
}