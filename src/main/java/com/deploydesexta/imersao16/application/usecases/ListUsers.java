package com.deploydesexta.imersao16.application.usecases;

import com.deploydesexta.imersao16.application.repositories.UserRepository;
import com.deploydesexta.imersao16.domain.User;

import java.util.List;
import java.util.Objects;

public class ListUsers {

    private final UserRepository userRepository;

    public ListUsers(final UserRepository userRepository) {
        this.userRepository = Objects.requireNonNull(userRepository);
    }

    public List<Output> execute() {
        return this.userRepository.allUsers().stream()
                .map(Output::new)
                .toList();
    }

    public record Output(String id, String email) {

        public Output(User user) {
            this(user.id(), user.email());
        }
    }
}
