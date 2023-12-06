package com.deploydesexta.imersao16.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordTypeTest {

    public static void main(String[] args) {
        final var expectedPassword = "123456";

        final var actualPassword = PasswordType.PLAIN.create(expectedPassword);

        Assertions.assertEquals(expectedPassword, actualPassword.value());
    }
    @Test
    public void deveriaCriarPlainTextPassowd() {

        final var expectedPassword = "123456";

        final var actualPassword = PasswordType.PLAIN.create(expectedPassword);

        Assertions.assertEquals(expectedPassword, actualPassword.value());
    }
}