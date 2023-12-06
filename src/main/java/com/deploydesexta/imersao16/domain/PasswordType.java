package com.deploydesexta.imersao16.domain;

import java.util.function.Function;

public enum PasswordType {
    PLAIN(PlainTextPassword::create, PlainTextPassword::restore),
    SHA1(SHA1Password::create, SHA1Password::restore),
    PBKDF2(PBKDF2Password::create, PBKDF2Password::restore);

    private final Function<String, Password> createFn;
    private final Function<String, Password> restoreFn;

    PasswordType(Function<String, Password> createFn, Function<String, Password> restorFn) {
        this.createFn = createFn;
        this.restoreFn = restorFn;
    }

    public Password create(final String plainPassword) {

        var p = new PlainTextPassword("");

        if (p instanceof PlainTextPassword(var s)) {

        }


        switch (p) {
            case PlainTextPassword(var value) -> value.length();
        }

        return createFn.apply(plainPassword);
    }

    public Password restore(final String password) {
        return restoreFn.apply(password);
    }
}
