package com.deploydesexta.imersao16.application.repositories;

import com.deploydesexta.imersao16.domain.User;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> userOfId(String userId);

    Optional<User> userOfEmail(String email);

    Collection<User> allUsers();
}
