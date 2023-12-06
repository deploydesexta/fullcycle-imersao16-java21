package com.deploydesexta.imersao16.infrastructure.configurations;

import com.deploydesexta.imersao16.application.repositories.UserRepository;
import com.deploydesexta.imersao16.application.usecases.CreateUser;
import com.deploydesexta.imersao16.application.usecases.GetUserOfId;
import com.deploydesexta.imersao16.application.usecases.ListUsers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {

    private final UserRepository userRepository;

    public UseCaseConfig(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public CreateUser createUser() {
        return new CreateUser(userRepository);
    }

    @Bean
    public GetUserOfId getUserOfId() {
        return new GetUserOfId(userRepository);
    }

    @Bean
    public ListUsers listUsers() {
        return new ListUsers(userRepository);
    }
}
