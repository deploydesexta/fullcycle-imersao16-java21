package com.deploydesexta.imersao16.application.usecases;

import com.deploydesexta.imersao16.application.repositories.UserRepository;
import com.deploydesexta.imersao16.domain.User;

import java.util.Objects;

public class GetUserOfId {

    private final UserRepository userRepository;

    public GetUserOfId(final UserRepository userRepository) {
        this.userRepository = Objects.requireNonNull(userRepository);
    }

    public Output execute(final Input input) {
        return this.userRepository.userOfId(input.id)
                .map(Output::new)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public record Input(String id) {
    }

    public record Output(String id, String email) {

        public Output(User user) {
            this(user.id(), user.email());
        }
    }
}
