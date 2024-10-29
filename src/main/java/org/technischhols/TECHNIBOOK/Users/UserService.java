package org.technischhols.TECHNIBOOK.Users;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.technischhols.TECHNIBOOK.Users.API.CreateUserRequest;

import java.util.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(CreateUserRequest createUserRequest) {
        User newUser = User.builder()
                .uuid(UUID.randomUUID().toString())
                .createDate(new Date())
                .email(createUserRequest.getEmail())
                .password(createUserRequest.getPassword())
                .build();
        User createdUser = userRepository.save(newUser);
        return createdUser;
    }

    public User getUser(String uuid) {
        return userRepository.findByUuid((uuid));
    }
}
